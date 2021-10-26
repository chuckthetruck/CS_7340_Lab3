
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

object topic4 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
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

            """),format.raw/*19.13*/(""".data """),format.raw/*19.19*/("""{"""),format.raw/*19.20*/("""
                """),format.raw/*20.17*/("""border: .5px solid black;
                border-collapse: collapse;
                max-width: 1000px;
                max-height: 50px;
                overflow: hidden;
                white-space: nowrap;
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""

            """),format.raw/*28.13*/(""".datarow """),format.raw/*28.22*/("""{"""),format.raw/*28.23*/("""
                """),format.raw/*29.17*/("""max-width: 50px;
                max-height: 50px;
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""table """),format.raw/*32.19*/("""{"""),format.raw/*32.20*/("""
                """),format.raw/*33.17*/("""width:50%
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
    """),format.raw/*35.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                Topic 4
            </h1>

        </header>

        <div>
            """),format.raw/*48.71*/("""
            """),format.raw/*49.49*/("""
            """),format.raw/*50.41*/("""
            """),format.raw/*51.33*/("""

        """),format.raw/*53.9*/("""<table>
            <tr class = "datarow">
                <th>Title</th>
                <th>Book Title</th>
                <th>Pages</th>
                <th>Year</th>
                <th>Url</th>
                <th>EE</th>
                <th>Publisher</th>
                <th>Journal</th>
                <th>Vol</th>
                <th>Number</th>
                <th>Crossref</th>
                <th>Isbn</th>
                <th>Abstract (Limited Chars)</th>
            </tr>


            """),_display_(/*71.14*/for(title <- message) yield /*71.35*/ {_display_(Seq[Any](format.raw/*71.37*/("""
                """),format.raw/*72.17*/("""<tr class="datarow">
                    """),_display_(/*73.22*/for(element <- title) yield /*73.43*/ {_display_(Seq[Any](format.raw/*73.45*/("""
                        """),format.raw/*74.25*/("""<td class="data">"""),_display_(/*74.43*/element),format.raw/*74.50*/("""</td>
                    """)))}),format.raw/*75.22*/("""
                    """),format.raw/*76.47*/("""
                """),format.raw/*77.17*/("""</tr>
            """)))}),format.raw/*78.14*/("""

            """),format.raw/*80.13*/("""</table>



        </div>

        """),format.raw/*86.90*/("""
        """),format.raw/*87.106*/("""
        """),format.raw/*88.28*/("""

        """),format.raw/*90.9*/("""<form action = """"),_display_(/*90.26*/routes/*90.32*/.HomeController.topicsHandler()),format.raw/*90.63*/("""" method="GET">
            <button id="api-get-page"  class="button" type="submit">Back to Topics</button>
        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(message:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-10-26T16:59:55.980
                  SOURCE: C:/Users/CJ/Desktop/8391/CS_7340_Lab3/Frontend/app/views/topic4.scala.html
                  HASH: 6a0febc6c4ecdcfa74681e86a0ab6e07ba7bb56b
                  MATRIX: 961->1|1084->31|1167->87|1195->88|1239->105|1627->465|1656->466|1698->480|1732->486|1761->487|1806->504|2055->725|2084->726|2126->740|2163->749|2192->750|2237->767|2328->830|2357->831|2398->844|2432->850|2461->851|2506->868|2556->890|2585->891|2617->896|2876->1185|2917->1234|2958->1275|2999->1308|3036->1318|3567->1822|3604->1843|3644->1845|3689->1862|3758->1904|3795->1925|3835->1927|3888->1952|3933->1970|3961->1977|4019->2004|4068->2051|4113->2068|4163->2087|4205->2101|4269->2218|4307->2324|4344->2352|4381->2362|4425->2379|4440->2385|4492->2416
                  LINES: 28->1|33->2|37->6|37->6|38->7|48->17|48->17|50->19|50->19|50->19|51->20|57->26|57->26|59->28|59->28|59->28|60->29|62->31|62->31|63->32|63->32|63->32|64->33|65->34|65->34|66->35|79->48|80->49|81->50|82->51|84->53|102->71|102->71|102->71|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|107->76|108->77|109->78|111->80|117->86|118->87|119->88|121->90|121->90|121->90|121->90
                  -- GENERATED --
              */
          