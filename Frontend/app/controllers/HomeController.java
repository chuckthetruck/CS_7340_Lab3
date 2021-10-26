package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import play.twirl.api.Html;
import utils.LazyConnection;
import views.html.*;
import java.sql.*;

import javax.inject.Inject;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CompletionStage;

public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;
    private Iterator it;

    private Connection conn;

    {
        try {
            conn = LazyConnection.getConnInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.login.render(""));
    }


    public Result lda(){return ok(views.html.login.render(""));}
    public Result ldaHandler(){
        return ok(views.html.login.render("LDA Ran"));
    }

    public Result topics(){return ok(views.html.topics.render(""));}
    public Result topicsHandler(){
        return ok(views.html.topics.render(""));
    }

    public Result topic0(){return ok(views.html.topic0.render(new ArrayList<List<String>>()));}
    public Result topic0Handler() throws SQLException {

        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 0;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic0.render(outlist));
    }

    public Result topic1(){return ok(views.html.topic1.render(new ArrayList<List<String>>()));}
    public Result topic1Handler() throws SQLException {


        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 1;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic1.render(outlist));
    }

    public Result topic2(){return ok(views.html.topic2.render(new ArrayList<List<String>>()));}
    public Result topic2Handler() throws SQLException {


        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 2;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic2.render(outlist));
    }

    public Result topic3(){return ok(views.html.topic3.render(new ArrayList<List<String>>()));}
    public Result topic3Handler() throws SQLException {


        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 3;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic3.render(outlist));
    }

    public Result topic4(){return ok(views.html.topic4.render(new ArrayList<List<String>>()));}
    public Result topic4Handler() throws SQLException {


        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 4;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic4.render(outlist));
    }

    public Result topic5(){return ok(views.html.topic5.render(new ArrayList<List<String>>()));}
    public Result topic5Handler() throws SQLException {


        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 5;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic5.render(outlist));
    }

    public Result topic6(){return ok(views.html.topic6.render(new ArrayList<List<String>>()));}
    public Result topic6Handler() throws SQLException {


        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 6;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic6.render(outlist));
    }

    public Result topic7(){return ok(views.html.topic7.render(new ArrayList<List<String>>()));}
    public Result topic7Handler() throws SQLException {


        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 7;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic7.render(outlist));
    }

    public Result topic8(){return ok(views.html.topic8.render(new ArrayList<List<String>>()));}
    public Result topic8Handler() throws SQLException {


        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 8;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic8.render(outlist));
    }

    public Result topic9(){return ok(views.html.topic9.render(new ArrayList<List<String>>()));}
    public Result topic9Handler() throws SQLException {
        

        ArrayList<List<String>> outlist = new ArrayList<List<String>>();

        String select_sql = "select * from papers where topic = 9;";
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(select_sql);
        while (rs.next()) {
            List<String> testlist = new ArrayList<>();
            testlist.add(rs.getString("title"));
            testlist.add(rs.getString("book_title"));
            testlist.add(rs.getString("pages"));
            testlist.add(rs.getString("year"));
            testlist.add(rs.getString("url"));
            testlist.add(rs.getString("ee"));
            testlist.add(rs.getString("publisher"));
            testlist.add(rs.getString("journal"));
            testlist.add(rs.getString("volume"));
            testlist.add(rs.getString("number"));
            testlist.add(rs.getString("crossref"));
            testlist.add(rs.getString("isbn"));
            testlist.add(rs.getString("abstract"));

            outlist.add(testlist);
        }

        return ok(views.html.topic9.render(outlist));
    }

}
