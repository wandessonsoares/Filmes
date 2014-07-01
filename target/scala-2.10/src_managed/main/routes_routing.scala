// @SOURCE:/media/Backup/java/workspace_play/filmes/conf/routes
// @HASH:54dc9af527dd7a1f38a18d6b04585b5e22ed92b9
// @DATE:Tue Jul 01 18:58:03 BRT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Inicio_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Application_sobre2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sobre"))))
        

// @LINE:13
private[this] lazy val controllers_Application_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play"))))
        

// @LINE:14
private[this] lazy val controllers_DiretorCRUD_lista4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/lista"))))
        

// @LINE:15
private[this] lazy val controllers_DiretorCRUD_novoDiretor5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/novo"))))
        

// @LINE:16
private[this] lazy val controllers_DiretorCRUD_gravar6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor"))))
        

// @LINE:17
private[this] lazy val controllers_DiretorCRUD_detalhar7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:18
private[this] lazy val controllers_DiretorCRUD_alterar8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_DiretorCRUD_remover9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("diretor/"),DynamicPart("id", """[^/]+""",true),StaticPart("/remover"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Inicio.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sobre""","""controllers.Application.sobre()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/lista""","""controllers.DiretorCRUD.lista()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/novo""","""controllers.DiretorCRUD.novoDiretor()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor""","""controllers.DiretorCRUD.gravar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>""","""controllers.DiretorCRUD.detalhar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>""","""controllers.DiretorCRUD.alterar(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>/remover""","""controllers.DiretorCRUD.remover(id:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Inicio_index0(params) => {
   call { 
        invokeHandler(controllers.Inicio.index(), HandlerDef(this, "controllers.Inicio", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_Application_sobre2(params) => {
   call { 
        invokeHandler(controllers.Application.sobre(), HandlerDef(this, "controllers.Application", "sobre", Nil,"GET", """ Método HTTP - URI - método que será chamado""", Routes.prefix + """sobre"""))
   }
}
        

// @LINE:13
case controllers_Application_index3(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """play"""))
   }
}
        

// @LINE:14
case controllers_DiretorCRUD_lista4(params) => {
   call { 
        invokeHandler(controllers.DiretorCRUD.lista(), HandlerDef(this, "controllers.DiretorCRUD", "lista", Nil,"GET", """""", Routes.prefix + """diretor/lista"""))
   }
}
        

// @LINE:15
case controllers_DiretorCRUD_novoDiretor5(params) => {
   call { 
        invokeHandler(controllers.DiretorCRUD.novoDiretor(), HandlerDef(this, "controllers.DiretorCRUD", "novoDiretor", Nil,"GET", """""", Routes.prefix + """diretor/novo"""))
   }
}
        

// @LINE:16
case controllers_DiretorCRUD_gravar6(params) => {
   call { 
        invokeHandler(controllers.DiretorCRUD.gravar(), HandlerDef(this, "controllers.DiretorCRUD", "gravar", Nil,"POST", """""", Routes.prefix + """diretor"""))
   }
}
        

// @LINE:17
case controllers_DiretorCRUD_detalhar7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DiretorCRUD.detalhar(id), HandlerDef(this, "controllers.DiretorCRUD", "detalhar", Seq(classOf[Long]),"GET", """""", Routes.prefix + """diretor/$id<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_DiretorCRUD_alterar8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DiretorCRUD.alterar(id), HandlerDef(this, "controllers.DiretorCRUD", "alterar", Seq(classOf[Long]),"POST", """""", Routes.prefix + """diretor/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_DiretorCRUD_remover9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DiretorCRUD.remover(id), HandlerDef(this, "controllers.DiretorCRUD", "remover", Seq(classOf[Long]),"POST", """""", Routes.prefix + """diretor/$id<[^/]+>/remover"""))
   }
}
        
}

}
     