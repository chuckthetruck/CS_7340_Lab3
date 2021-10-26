
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

object q11 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

    <style>
        .button """),format.raw/*6.17*/("""{"""),format.raw/*6.18*/("""
            """),format.raw/*7.13*/("""background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
    """),format.raw/*18.5*/("""</style>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                Query 1.1 Paper Search
            </h1>

        </header>

        <div>
            <p class="focused" style="font-size: 20px;
            color: #3F51B5">
                """),_display_(/*33.18*/message),format.raw/*33.25*/("""
            """),format.raw/*34.13*/("""</p>

        </div>

        <form action = """"),_display_(/*38.26*/routes/*38.32*/.HomeController.q11Handler()),format.raw/*38.60*/("""" method="GET">
            <label>Paper title</label>
            <input type = "text" maxlength="100" id="title" name="title">
            <button id="api-get-page"  class="button" type="submit">1.1 Paper Search</button>
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
                  DATE: 2021-10-05T13:22:44.171
                  SOURCE: /Users/andrewbrkich/Desktop/CS_7340_Lab2/Frontend/app/views/q11.scala.html
                  HASH: 1dd2ecbcfb162ceaa00108c10d970928561b2986
                  MATRIX: 946->1|1057->19|1136->71|1164->72|1204->85|1551->405|1580->406|1612->411|1974->746|2002->753|2043->766|2117->813|2132->819|2181->847
                  LINES: 28->1|33->2|37->6|37->6|38->7|48->17|48->17|49->18|64->33|64->33|65->34|69->38|69->38|69->38
                  -- GENERATED --
              */
          