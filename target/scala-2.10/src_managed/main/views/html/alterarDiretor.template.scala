
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
object alterarDiretor extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Diretor],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, diretorForm: Form[Diretor]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.40*/("""
"""),_display_(Seq[Any](/*3.2*/main("Alterar diretor")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
	<div class="container">
		<div class="header">
			<ul class="nav nav-pills pull-right">
				<li class="active"><a href="/">Home</a></li>
			</ul>
		</div>

		<h1>Alterar diretor</h1>
	
		"""),_display_(Seq[Any](/*13.4*/form(routes.DiretorCRUD.alterar(id))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
			<fieldset>
				"""),_display_(Seq[Any](/*15.6*/inputText(diretorForm("nome"), '_label -> "Nome do diretor"))),format.raw/*15.66*/("""
			</fieldset>
		
			<div class="control-group">
				<div class="actions">
					<input type="submit" value="Gravar" class="btn btn-primary">
					<a href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.DiretorCRUD.lista())),format.raw/*21.42*/("""" class="btn btn-primary">
					Cancelar
					</a>
					""")))})),format.raw/*24.7*/("""
					"""),_display_(Seq[Any](/*25.7*/form(routes.DiretorCRUD.remover(id))/*25.43*/ {_display_(Seq[Any](format.raw/*25.45*/("""
					<input type="submit" value="Remover esse diretor"
					class="btn danger">
					""")))})),format.raw/*28.7*/("""
				</div>
			</div>
	</div>
""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(id:Long,diretorForm:Form[Diretor]): play.api.templates.HtmlFormat.Appendable = apply(id,diretorForm)
    
    def f:((Long,Form[Diretor]) => play.api.templates.HtmlFormat.Appendable) = (id,diretorForm) => apply(id,diretorForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 01 18:58:52 BRT 2014
                    SOURCE: /media/Backup/java/workspace_play/filmes/app/views/alterarDiretor.scala.html
                    HASH: 5edeb5e1da4d3d481923c9f3dbd46967d14226b3
                    MATRIX: 795->1|943->39|979->58|1010->81|1049->83|1274->273|1319->309|1359->311|1414->331|1496->391|1689->548|1704->554|1746->574|1834->631|1876->638|1921->674|1961->676|2079->763|2141->794
                    LINES: 26->1|30->1|31->3|31->3|31->3|41->13|41->13|41->13|43->15|43->15|49->21|49->21|49->21|52->24|53->25|53->25|53->25|56->28|60->32
                    -- GENERATED --
                */
            