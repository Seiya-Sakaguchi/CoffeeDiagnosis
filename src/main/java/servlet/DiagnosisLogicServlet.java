package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/DiagnosisLogicServlet")
public class DiagnosisLogicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        
        String temperature = request.getParameter("temperature");
        session.setAttribute("temperature", temperature);

        // セッションから回答を取得
        String scene = (String) session.getAttribute("scene");
        String flavor = (String) session.getAttribute("flavor");
        String temp = (String) session.getAttribute("temperature");
        System.out.println(scene + flavor + temp);

        String key = scene + "-" + flavor + "-" + temperature;
        String coffeeName;

        switch (key) {
            case "朝-フルーティ-ホット":
                coffeeName = "コスタリカ";
                break;
            case "朝-フルーティ-アイス":
                coffeeName = "ケニア";
                break;
            case "朝-スイート-ホット":
                coffeeName = "タンザニア";
                break;
            case "朝-スイート-アイス":
                coffeeName = "グァテマラ";
                break;
            case "朝-ビター-ホット":
                coffeeName = "コロンビア";
                break;
            case "朝-ビター-アイス":
                coffeeName = "ルワンダ";
                break;
            case "朝-ナッティ-ホット":
                coffeeName = "ブラジル";
                break;
            case "朝-ナッティ-アイス":
                coffeeName = "メキシコ";
                break;
            case "仕事中-フルーティ-ホット":
                coffeeName = "エチオピア（ウォッシュド）";
                break;
            case "仕事中-フルーティ-アイス":
                coffeeName = "ドミニカ";
                break;
            case "仕事中-スイート-ホット":
                coffeeName = "グァテマラ";
                break;
            case "仕事中-スイート-アイス":
                coffeeName = "ブラジル";
                break;
            case "仕事中-ビター-ホット":
                coffeeName = "マンデリン";
                break;
            case "仕事中-ビター-アイス":
                coffeeName = "コロンビア";
                break;
            case "仕事中-ナッティ-ホット":
                coffeeName = "ブラジル";
                break;
            case "仕事中-ナッティ-アイス":
                coffeeName = "ペルー";
                break;
            case "リラックスタイム-フルーティ-ホット":
                coffeeName = "エチオピア（ナチュラル）";
                break;
            case "リラックスタイム-フルーティ-アイス":
                coffeeName = "タンザニア（キリマンジャロ）";
                break;
            case "リラックスタイム-スイート-ホット":
                coffeeName = "モカ・マタリ（イエメン）";
                break;
            case "リラックスタイム-スイート-アイス":
                coffeeName = "パナマ（ハニープロセス）";
                break;
            case "リラックスタイム-ビター-ホット":
                coffeeName = "ブルーマウンテン";
                break;
            case "リラックスタイム-ビター-アイス":
                coffeeName = "インドネシア（トラジャ）";
                break;
            case "リラックスタイム-ナッティ-ホット":
                coffeeName = "ハワイコナ";
                break;
            case "リラックスタイム-ナッティ-アイス":
                coffeeName = "パプアニューギニア";
                break;
            default:
                coffeeName = "おすすめが見つかりませんでした";
        }

        // 結果をリクエストに格納し、JSPへ
        request.setAttribute("coffeeName", coffeeName);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/result.jsp");
        rd.forward(request, response);
    }
}


