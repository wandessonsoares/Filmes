
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
		<title>"""),_display_(Seq[Any](/*7.11*/title)),format.raw/*7.16*/("""</title>
		<link href=""""),_display_(Seq[Any](/*8.16*/routes/*8.22*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*8.67*/("""" rel="stylesheet" media="screen">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.48*/routes/*9.54*/.Assets.at("stylesheets/main.css"))),format.raw/*9.88*/("""">
		<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.53*/routes/*10.59*/.Assets.at("images/favicon.png"))),format.raw/*10.91*/("""">
		<script src=""""),_display_(Seq[Any](/*11.17*/routes/*11.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.68*/("""" type="text/javascript">
		</script>
	</head>
    <body>
    
    	"""),_display_(Seq[Any](/*16.7*/if(flash.containsKey("sucesso"))/*16.39*/ {_display_(Seq[Any](format.raw/*16.41*/("""
			<div class="alert alert-success">
			"""),_display_(Seq[Any](/*18.5*/flash/*18.10*/.get("sucesso"))),format.raw/*18.25*/("""
		</div>
		""")))})),format.raw/*20.4*/("""
		
		"""),_display_(Seq[Any](/*22.4*/if(flash.containsKey("erro"))/*22.33*/ {_display_(Seq[Any](format.raw/*22.35*/("""
			<div class="alert alert-danger">
			"""),_display_(Seq[Any](/*24.5*/flash/*24.10*/.get("erro"))),format.raw/*24.22*/("""
		</div>
		""")))})),format.raw/*26.4*/("""
		    	
        """),_display_(Seq[Any](/*28.10*/content)),format.raw/*28.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 27 23:55:38 BRT 2014
                    SOURCE: /media/Backup/java/workspace_play/filmes/app/views/main.scala.html
                    HASH: 118d0c1232328dd36390229cd7d097ba7b1c5d58
                    MATRIX: 778->1|902->31|984->78|1010->83|1069->107|1083->113|1149->158|1266->240|1280->246|1335->280|1426->335|1441->341|1495->373|1550->392|1565->398|1632->443|1736->512|1777->544|1817->546|1894->588|1908->593|1945->608|1989->621|2031->628|2069->657|2109->659|2185->700|2199->705|2233->717|2277->730|2331->748|2360->755
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|44->16|44->16|44->16|46->18|46->18|46->18|48->20|50->22|50->22|50->22|52->24|52->24|52->24|54->26|56->28|56->28
                    -- GENERATED --
                */
            