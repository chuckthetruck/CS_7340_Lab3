
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <style>
        .grid-container """),format.raw/*6.25*/("""{"""),format.raw/*6.26*/("""
            """),format.raw/*7.13*/("""display: grid;
            grid-template-columns: auto auto auto;
            background-color: #2196F3;
            padding: 10px;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""

        """),format.raw/*13.9*/(""".grid-item """),format.raw/*13.20*/("""{"""),format.raw/*13.21*/("""
            """),format.raw/*14.13*/("""background-color: rgba(255, 255, 255, 0.8);
            border: 1px solid rgba(0, 0, 0, 0.8);
            padding: 5px;
            font-size: 30px;
            text-align: center;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""

        """),format.raw/*21.9*/(""".button """),format.raw/*21.17*/("""{"""),format.raw/*21.18*/("""
            """),format.raw/*22.13*/("""background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
    """),format.raw/*33.5*/("""</style>


    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                LDA
            </h1>

        </header>

        <div>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">
            """),_display_(/*63.14*/message),format.raw/*63.21*/("""
            """),format.raw/*64.13*/("""</p>

        </div>

        <div>
            <script id='script' type='text/javascript'>
                    if ("""),_display_(/*70.26*/message),format.raw/*70.33*/(""" """),format.raw/*70.34*/("""= "Ran LDA")
                        <p>Topic 1</p>
                    else
                        <p>Please run LDA</p>
                    //display or sql query the topic names, as hrefs to new pages (or button)
            </script>
        </div>

        <form action = """"),_display_(/*78.26*/routes/*78.32*/.HomeController.topicsHandler()),format.raw/*78.63*/("""" method="GET">
            <button id="api-get-page"  class="button" type="submit">Run LDA</button>
        </form>
    </body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-26T16:59:55.931
                  SOURCE: C:/Users/CJ/Desktop/8391/CS_7340_Lab3/Frontend/app/views/login.scala.html
                  HASH: fa5c231f6c73b07d4f3fdbecedf636af7f1b3145
                  MATRIX: 948->1|1059->19|1146->79|1174->80|1214->93|1381->233|1410->234|1447->244|1486->255|1515->256|1556->269|1772->458|1801->459|1838->469|1874->477|1903->478|1944->491|2291->811|2320->812|2352->817|3863->2303|3891->2310|3932->2323|4076->2440|4104->2447|4133->2448|4440->2728|4455->2734|4507->2765
                  LINES: 28->1|33->2|37->6|37->6|38->7|42->11|42->11|44->13|44->13|44->13|45->14|50->19|50->19|52->21|52->21|52->21|53->22|63->32|63->32|64->33|94->63|94->63|95->64|101->70|101->70|101->70|109->78|109->78|109->78
                  -- GENERATED --
              */
          