package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * The main Controller for the Application.
 * 
 * @author Massimo Carli - 27/dic/2012
 * 
 */
public class NPApplication extends Controller {

	public static Result index() {
		return ok(views.html.index.render());
	}

	public static Result adminAccountType() {
		return ok(views.html.account_type.render());
	}

	public static Result adminRoleType() {
		return ok(views.html.role_type.render());
	}

	public static Result adminMediaType() {
		return ok(views.html.media_type.render());
	}

	public static Result adminUsers() {
		return ok(views.html.user.render());
	}

	public static Result adminAccount(Long id) {
		return ok(views.html.account.render(id));
	}

	public static Result adminPeople() {
		return ok(views.html.people.render());
	}

	public static Result adminPlaces() {
		return ok(views.html.places.render());
	}

	public static Result searchFreeText() {
		return ok(views.html.places_free_search.render());
	}

	public static Result adminUpload() {
		return ok(views.html.upload.render());
	}
	
	public static Result adminMedia() {
		return ok(views.html.media.render());
	}	

}
