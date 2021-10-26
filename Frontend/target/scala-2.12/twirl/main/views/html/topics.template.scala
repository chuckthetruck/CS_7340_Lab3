
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

object topics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <style>
            .button """),format.raw/*6.21*/("""{"""),format.raw/*6.22*/("""
                """),format.raw/*7.17*/("""background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
    """),format.raw/*18.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                Topics
            </h1>

        </header>

        <div>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">
                """),_display_(/*33.18*/message),format.raw/*33.25*/("""
            """),format.raw/*34.13*/("""</p>

        </div>

        <form action = """"),_display_(/*38.26*/routes/*38.32*/.HomeController.topic0Handler()),format.raw/*38.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 0</button>
        </form>
        <form action = """"),_display_(/*41.26*/routes/*41.32*/.HomeController.topic1Handler()),format.raw/*41.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 1</button>
        </form>
        <form action = """"),_display_(/*44.26*/routes/*44.32*/.HomeController.topic2Handler()),format.raw/*44.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 2</button>
        </form>
        <form action = """"),_display_(/*47.26*/routes/*47.32*/.HomeController.topic3Handler()),format.raw/*47.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 3</button>
        </form>
        <form action = """"),_display_(/*50.26*/routes/*50.32*/.HomeController.topic4Handler()),format.raw/*50.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 4</button>
        </form>
        <form action = """"),_display_(/*53.26*/routes/*53.32*/.HomeController.topic5Handler()),format.raw/*53.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 5</button>
        </form>
        <form action = """"),_display_(/*56.26*/routes/*56.32*/.HomeController.topic6Handler()),format.raw/*56.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 6</button>
        </form>
        <form action = """"),_display_(/*59.26*/routes/*59.32*/.HomeController.topic7Handler()),format.raw/*59.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 7</button>
        </form>
        <form action = """"),_display_(/*62.26*/routes/*62.32*/.HomeController.topic8Handler()),format.raw/*62.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 8</button>
        </form>
        <form action = """"),_display_(/*65.26*/routes/*65.32*/.HomeController.topic9Handler()),format.raw/*65.63*/("""" method="GET">
            <button  id="api-get-page"  class="button">Topic 9</button>
        </form>


        <form action = """"),_display_(/*70.26*/routes/*70.32*/.HomeController.ldaHandler()),format.raw/*70.60*/("""" method="GET">
            <button id="api-get-page"  class="button" type="submit">Back to LDA</button>
        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-26T16:59:56.019
                  SOURCE: C:/Users/CJ/Desktop/8391/CS_7340_Lab3/Frontend/app/views/topics.scala.html
                  HASH: ad6fdcc5faf3c8cb48e8fee6b81cf2a5a4d1dfb8
                  MATRIX: 949->1|1060->19|1143->75|1171->76|1215->93|1603->453|1632->454|1664->459|2014->782|2042->789|2083->802|2157->849|2172->855|2224->886|2380->1015|2395->1021|2447->1052|2603->1181|2618->1187|2670->1218|2826->1347|2841->1353|2893->1384|3049->1513|3064->1519|3116->1550|3272->1679|3287->1685|3339->1716|3495->1845|3510->1851|3562->1882|3718->2011|3733->2017|3785->2048|3941->2177|3956->2183|4008->2214|4164->2343|4179->2349|4231->2380|4389->2511|4404->2517|4453->2545
                  LINES: 28->1|33->2|37->6|37->6|38->7|48->17|48->17|49->18|64->33|64->33|65->34|69->38|69->38|69->38|72->41|72->41|72->41|75->44|75->44|75->44|78->47|78->47|78->47|81->50|81->50|81->50|84->53|84->53|84->53|87->56|87->56|87->56|90->59|90->59|90->59|93->62|93->62|93->62|96->65|96->65|96->65|101->70|101->70|101->70
                  -- GENERATED --
              */
          