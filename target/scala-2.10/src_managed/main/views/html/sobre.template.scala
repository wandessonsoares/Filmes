
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
object sobre extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(sistema:String)(versaoDoPlay:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

"""),_display_(Seq[Any](/*3.2*/main(sistema)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
	<div class="container">
		<div class="header">
			<ul class="nav nav-pills pull-right">
				<li class="active"><a href="/">Home</a></li>
			</ul>
			<h3 class="text-muted">"""),_display_(Seq[Any](/*9.28*/sistema)),format.raw/*9.35*/("""</h3>
			</div>
		<div class="hero-unit">
			<p><a class="btn btn-lg btn-success" href="#">
			powered by Play Framework """),_display_(Seq[Any](/*13.31*/versaoDoPlay)),format.raw/*13.43*/("""</a></p>
		</div>
	</div>
""")))})),format.raw/*16.2*/("""

	
"""))}
    }
    
    def render(sistema:String,versaoDoPlay:String): play.api.templates.HtmlFormat.Appendable = apply(sistema)(versaoDoPlay)
    
    def f:((String) => (String) => play.api.templates.HtmlFormat.Appendable) = (sistema) => (versaoDoPlay) => apply(sistema)(versaoDoPlay)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 27 23:55:38 BRT 2014
                    SOURCE: /media/Backup/java/workspace_play/filmes/app/views/sobre.scala.html
                    HASH: 38ace3a1220fc453e427ba241fc625ea3d449d9c
                    MATRIX: 781->1|912->38|949->41|970->54|1008->55|1218->230|1246->237|1404->359|1438->371|1496->398
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|41->13|41->13|44->16
                    -- GENERATED --
                */
            