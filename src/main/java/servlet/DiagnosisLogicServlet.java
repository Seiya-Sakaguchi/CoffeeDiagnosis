package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.CoffeeAnswer;
import model.CoffeeProfile;

@WebServlet("/DiagnosisLogicServlet")
public class DiagnosisLogicServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();

        // ユーザー回答を CoffeeAnswer に格納
        String scene = request.getParameter("scene");
        String flavor = request.getParameter("flavor");
        String temp = request.getParameter("temperature");

        CoffeeAnswer answer = new CoffeeAnswer();
        answer.setScene(scene);
        answer.setFlavor(flavor);
        answer.setTemperature(temp);

        // セッションに保持（戻る機能などで使用）
        session.setAttribute("answer", answer);

        // キーを生成（例: m-f-h）
        String key = scene + "-" + flavor + "-" + temp;

        // JSONファイルの読み込み
        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream("/DATA/coffeeData.json");

        ObjectMapper mapper = new ObjectMapper();
        Map<String, CoffeeProfile> profileMap = mapper.readValue(
            is, new TypeReference<Map<String, CoffeeProfile>>() {}
        );

        // 対応するコーヒープロフィールを取得
        CoffeeProfile profile = profileMap.get(key);

        // JSPに表示用としてセット
        request.setAttribute("coffeeProfile", profile);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/test.jsp");
        rd.forward(request, response);
        

        if (answer != null) {
            System.out.println("【セッション確認】");
            System.out.println("scene: " + answer.getScene());
            System.out.println("flavor: " + answer.getFlavor());
            System.out.println("temperature: " + answer.getTemperature());
            System.out.println("name: " + profile.getName());
        }

    }
}
