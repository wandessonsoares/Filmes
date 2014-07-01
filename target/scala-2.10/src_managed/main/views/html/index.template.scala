
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Top 100 filmes Cult")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

   <style>
		.starter-template """),format.raw/*6.21*/("""{"""),format.raw/*6.22*/("""
			padding: 40px 15px;
			text-align: center;
		"""),format.raw/*9.3*/("""}"""),format.raw/*9.4*/("""
	</style>
	
	<div class="navbar navbar-inverse">
	  <div class="navbar-inner">
	    <a class="brand" href="#">Top 100 filmes Cult</a>
	    <ul class="nav">
	      <li><a href="/diretor/lista">Diretores</a></li> 
	      <li><a href="/sobre">Sobre o sistema</a></li>
	      <li><a href="/play">Sobre o Play Framework</a></li>
	      <li><a href="http://getbootstrap.com/">Sobre o Bootstrap</a></li>
	    </ul>
	  </div>
	</div>
	<div class="container">
		<div class="starter-template">
			<h1>Top 100 filmes Cult</h1>
			<p class="lead">"""),_display_(Seq[Any](/*26.21*/message)),format.raw/*26.28*/("""</p>
		</div>
	</div>
""")))})),format.raw/*29.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 27 23:55:38 BRT 2014
                    SOURCE: /media/Backup/java/workspace_play/filmes/app/views/index.scala.html
                    HASH: 865a8518c5627f88bb12cc6b6f4089c088e9acf3
                    MATRIX: 774->1|885->18|922->21|957->48|996->50|1056->83|1084->84|1159->133|1186->134|1759->671|1788->678|1842->701
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|37->9|37->9|54->26|54->26|57->29
                    -- GENERATED --
                */
            