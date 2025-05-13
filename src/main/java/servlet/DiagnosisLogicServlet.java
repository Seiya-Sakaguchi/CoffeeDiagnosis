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

        String temperature = request.getParameter("temperature");
        session.setAttribute("temperature", temperature);
        
        String scene = (String) session.getAttribute("scene");
        String flavor = (String) session.getAttribute("flavor");
        
        CoffeeAnswer answer = new CoffeeAnswer();
        answer.setScene(scene);
        answer.setFlavor(flavor);
        answer.setTemperature(temperature);
       
        // セッションに保持（戻る機能などで使用）
        session.setAttribute("answer", answer);
        
        // キーを生成（例: m-f-h）
        String key = scene + "-" + flavor + "-" + temperature;

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
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/result.jsp");
        rd.forward(request, response);
    }
}
