
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
object diretor extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Diretor],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(diretores: List[Diretor]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.28*/("""

"""),_display_(Seq[Any](/*3.2*/main("Diretores")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
	<div class="container">
	<div class="header">
		<ul class="nav nav-pills pull-right">
		<li class="active">
		<a href=""""),_display_(Seq[Any](/*8.13*/routes/*8.19*/.DiretorCRUD.novoDiretor())),format.raw/*8.45*/("""">
		Novo diretor
		</a>
		</li>
		<li class="active"><a href="/">Home</a></li>
		</ul>
		<h3 class="text-muted">Diretores</h3>
	</div>	
	<table class="table table-striped table-bordered" id="example" cellpadding="0" cellspacing="0" border="0" width="100%">
		<tfoot>
			"""),_display_(Seq[Any](/*18.5*/for(diretor <- diretores) yield /*18.30*/ {_display_(Seq[Any](format.raw/*18.32*/("""
				<tr>
					<th>
					<a href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.DiretorCRUD.detalhar(diretor.id))),format.raw/*21.55*/(""""
					">
					"""),_display_(Seq[Any](/*23.7*/diretor/*23.14*/.nome)),format.raw/*23.19*/("""
					</a>
					</th>
				</tr>
			""")))})),format.raw/*27.5*/("""
		</tfoot>
	</table>
	</div>
""")))})))}
    }
    
    def render(diretores:List[Diretor]): play.api.templates.HtmlFormat.Appendable = apply(diretores)
    
    def f:((List[Diretor]) => play.api.templates.HtmlFormat.Appendable) = (diretores) => apply(diretores)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 01 19:02:09 BRT 2014
                    SOURCE: /media/Backup/java/workspace_play/filmes/app/views/diretor.scala.html
                    HASH: e9881792e07ddf48cae2e3e626fc2072720bc8d4
                    MATRIX: 783->1|903->27|940->30|965->47|1003->48|1160->170|1174->176|1221->202|1528->474|1569->499|1609->501|1680->536|1695->542|1750->575|1801->591|1817->598|1844->603|1911->639
                    LINES: 26->1|29->1|31->3|31->3|31->3|36->8|36->8|36->8|46->18|46->18|46->18|49->21|49->21|49->21|51->23|51->23|51->23|55->27
                    -- GENERATED --
                */
            