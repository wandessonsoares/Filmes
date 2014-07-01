// @SOURCE:/media/Backup/java/workspace_play/filmes/conf/routes
// @HASH:54dc9af527dd7a1f38a18d6b04585b5e22ed92b9
// @DATE:Tue Jul 01 18:58:03 BRT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:6
class ReverseInicio {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseDiretorCRUD {
    

// @LINE:18
def alterar(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "diretor/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:15
def novoDiretor(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "diretor/novo")
}
                                                

// @LINE:16
def gravar(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "diretor")
}
                                                

// @LINE:19
def remover(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "diretor/" + implicitly[PathBindable[Long]].unbind("id", id) + "/remover")
}
                                                

// @LINE:14
def lista(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "diretor/lista")
}
                                                

// @LINE:17
def detalhar(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "diretor/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:12
class ReverseApplication {
    

// @LINE:12
def sobre(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sobre")
}
                                                

// @LINE:13
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play")
}
                                                
    
}
                          
}
                  


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseInicio {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Inicio.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseDiretorCRUD {
    

// @LINE:18
def alterar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.alterar",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def novoDiretor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.novoDiretor",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/novo"})
      }
   """
)
                        

// @LINE:16
def gravar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.gravar",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor"})
      }
   """
)
                        

// @LINE:19
def remover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.remover",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
      }
   """
)
                        

// @LINE:14
def lista : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.lista",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/lista"})
      }
   """
)
                        

// @LINE:17
def detalhar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DiretorCRUD.detalhar",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:12
class ReverseApplication {
    

// @LINE:12
def sobre : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sobre",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sobre"})
      }
   """
)
                        

// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:6
class ReverseInicio {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Inicio.index(), HandlerDef(this, "controllers.Inicio", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseDiretorCRUD {
    

// @LINE:18
def alterar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.alterar(id), HandlerDef(this, "controllers.DiretorCRUD", "alterar", Seq(classOf[Long]), "POST", """""", _prefix + """diretor/$id<[^/]+>""")
)
                      

// @LINE:15
def novoDiretor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.novoDiretor(), HandlerDef(this, "controllers.DiretorCRUD", "novoDiretor", Seq(), "GET", """""", _prefix + """diretor/novo""")
)
                      

// @LINE:16
def gravar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.gravar(), HandlerDef(this, "controllers.DiretorCRUD", "gravar", Seq(), "POST", """""", _prefix + """diretor""")
)
                      

// @LINE:19
def remover(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.remover(id), HandlerDef(this, "controllers.DiretorCRUD", "remover", Seq(classOf[Long]), "POST", """""", _prefix + """diretor/$id<[^/]+>/remover""")
)
                      

// @LINE:14
def lista(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.lista(), HandlerDef(this, "controllers.DiretorCRUD", "lista", Seq(), "GET", """""", _prefix + """diretor/lista""")
)
                      

// @LINE:17
def detalhar(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DiretorCRUD.detalhar(id), HandlerDef(this, "controllers.DiretorCRUD", "detalhar", Seq(classOf[Long]), "GET", """""", _prefix + """diretor/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
class ReverseApplication {
    

// @LINE:12
def sobre(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sobre(), HandlerDef(this, "controllers.Application", "sobre", Seq(), "GET", """ Método HTTP - URI - método que será chamado""", _prefix + """sobre""")
)
                      

// @LINE:13
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """play""")
)
                      
    
}
                          
}
        
    