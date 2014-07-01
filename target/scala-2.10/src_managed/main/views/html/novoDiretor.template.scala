
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
object novoDiretor extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Diretor],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(diretorForm : Form[Diretor]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),_display_(Seq[Any](/*3.2*/main("Novo diretor")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
	<div class="container">
		<div class="header">
			<ul class="nav nav-pills pull-right">
				<li class="active"><a href="/">Home</a></li>
			</ul>
		</div>
	<div>
		
	"""),_display_(Seq[Any](/*12.3*/helper/*12.9*/.form(action=routes.DiretorCRUD.gravar())/*12.50*/ {_display_(Seq[Any](format.raw/*12.52*/("""
		<form class="form-horizontal">
		<fieldset>
		<legend>Novo diretor</legend>
		
		<div class="control-group">
			<div class="controls">
				"""),_display_(Seq[Any](/*19.6*/helper/*19.12*/.inputText(diretorForm("nome")))),format.raw/*19.43*/("""
				<p class="help-block">informe o nome do diretor</p>
			</div>
		</div>
		""")))})),format.raw/*23.4*/("""
		
		<div class="control-group">
			<label class="control-label" for="singlebutton"></label>
			<div class="controls">
				<button id="singlebutton" name="singlebutton"
				class="btn btn-primary">
				Gravar
				</button>
			</div>
		</div>
	
	</div>
""")))})),format.raw/*36.2*/("""

		
	
	

"""))}
    }
    
    def render(diretorForm:Form[Diretor]): play.api.templates.HtmlFormat.Appendable = apply(diretorForm)
    
    def f:((Form[Diretor]) => play.api.templates.HtmlFormat.Appendable) = (diretorForm) => apply(diretorForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 27 23:55:38 BRT 2014
                    SOURCE: /media/Backup/java/workspace_play/filmes/app/views/novoDiretor.scala.html
                    HASH: d96dc0755c0385e73e5e4c034de3ab4e18ede752
                    MATRIX: 787->1|910->30|947->33|975->53|1014->55|1218->224|1232->230|1282->271|1322->273|1500->416|1515->422|1568->453|1678->532|1963->786
                    LINES: 26->1|29->1|31->3|31->3|31->3|40->12|40->12|40->12|40->12|47->19|47->19|47->19|51->23|64->36
                    -- GENERATED --
                */
            