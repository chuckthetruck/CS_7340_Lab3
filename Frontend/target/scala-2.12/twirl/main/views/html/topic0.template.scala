
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

object topic0 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

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

        """),format.raw/*19.9*/(""".data """),format.raw/*19.15*/("""{"""),format.raw/*19.16*/("""
            """),format.raw/*20.13*/("""border: .5px solid black;
            border-collapse: collapse;
            max-width: 1000px;
            max-height: 50px;
            overflow: hidden;
            white-space: nowrap;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""

        """),format.raw/*28.9*/(""".datarow """),format.raw/*28.18*/("""{"""),format.raw/*28.19*/("""
            """),format.raw/*29.13*/("""max-width: 50px;
            max-height: 50px;
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""table """),format.raw/*32.15*/("""{"""),format.raw/*32.16*/("""
            """),format.raw/*33.13*/("""width:50%
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                Topic 0
            </h1>

        </header>

        <div>
"""),format.raw/*48.59*/("""
"""),format.raw/*49.37*/("""
"""),format.raw/*50.29*/("""
"""),format.raw/*51.21*/("""

            """),format.raw/*53.13*/("""<table>
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


                    """),_display_(/*71.22*/for(title <- message) yield /*71.43*/ {_display_(Seq[Any](format.raw/*71.45*/("""
                        """),format.raw/*72.25*/("""<tr class="datarow">
                            """),_display_(/*73.30*/for(element <- title) yield /*73.51*/ {_display_(Seq[Any](format.raw/*73.53*/("""
                                """),format.raw/*74.33*/("""<td class="data">"""),_display_(/*74.51*/element),format.raw/*74.58*/("""</td>
                            """)))}),format.raw/*75.30*/("""
                            """),format.raw/*76.55*/("""
                        """),format.raw/*77.25*/("""</tr>
                    """)))}),format.raw/*78.22*/("""

            """),format.raw/*80.13*/("""</table>



        </div>

"""),format.raw/*86.82*/("""
"""),format.raw/*87.98*/("""
"""),format.raw/*88.20*/("""

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
                  DATE: 2021-10-26T17:06:25.802
                  SOURCE: C:/Users/CJ/Desktop/8391/CS_7340_Lab3/Frontend/app/views/topic0.scala.html
                  HASH: d631ea706b310cb3cd280231da7f5a0e857be50d
                  MATRIX: 961->1|1084->31|1167->87|1195->88|1239->105|1627->465|1656->466|1693->476|1727->482|1756->483|1797->496|2021->693|2050->694|2087->704|2124->713|2153->714|2194->727|2276->782|2305->783|2341->792|2375->798|2404->799|2445->812|2490->830|2519->831|2551->836|2798->1113|2827->1150|2856->1179|2885->1200|2927->1214|3526->1786|3563->1807|3603->1809|3656->1834|3733->1884|3770->1905|3810->1907|3871->1940|3916->1958|3944->1965|4010->2000|4067->2055|4120->2080|4178->2107|4220->2121|4276->2230|4305->2328|4334->2348|4371->2358|4415->2375|4430->2381|4482->2412
                  LINES: 28->1|33->2|37->6|37->6|38->7|48->17|48->17|50->19|50->19|50->19|51->20|57->26|57->26|59->28|59->28|59->28|60->29|62->31|62->31|63->32|63->32|63->32|64->33|65->34|65->34|66->35|79->48|80->49|81->50|82->51|84->53|102->71|102->71|102->71|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|107->76|108->77|109->78|111->80|117->86|118->87|119->88|121->90|121->90|121->90|121->90
                  -- GENERATED --
              */
          