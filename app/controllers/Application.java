package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
    public static Result index() {
        return ok(index.render("O melhor do cinema está aqui."));
    }
    
    public static Result sobre(){
    	return ok(views.html.sobre.render("Top 100 filmes Cult", play.core.PlayVersion.current())
    	);
    }	    
}
