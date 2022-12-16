package com.bus.cont.general;

import com.bus.models.enums.Roles;
import org.springframework.ui.Model;

public class Attr extends General {

    protected void AddAttributes(Model model) {
        model.addAttribute("role", getUserRole());
    }

    protected void AddAttributesReg(Model model) {
        AddAttributes(model);
    }

    protected void AddAttributesIndex(Model model) {
        AddAttributes(model);
        model.addAttribute("routes", repoRouters.findAll());
    }

    protected void AddAttributesLogin(Model model) {
        AddAttributes(model);
    }

    protected void AddAttributesDateAdd(Model model, Long id) {
        AddAttributes(model);
        model.addAttribute("route", repoRouters.getById(id));
    }

    protected void AddAttributesDateEdit(Model model, Long id_route, Long id_date) {
        AddAttributes(model);
        model.addAttribute("route", repoRouters.getById(id_route));
        model.addAttribute("date", repoRouteDate.getById(id_date));
    }

    protected void AddAttributesRouteAdd(Model model) {
        AddAttributes(model);
    }

    protected void AddAttributesCart(Model model) {
        AddAttributes(model);
        if (!getUserRole().equals("NOT")) {
            model.addAttribute("reserves", repoReserves.findByPassport(getUser().getPassport()));
        }
    }

    protected void AddAttributesSearch(Model model, String search) {
        AddAttributes(model);
        model.addAttribute("reserves", repoReserves.findByPassport(search));
    }

    protected void AddAttributesProfile(Model model) {
        AddAttributes(model);
        model.addAttribute("user", getUser());
    }

    protected void AddAttributesProfiles(Model model) {
        AddAttributes(model);
        model.addAttribute("users", repoUsers.findAll());
        model.addAttribute("roles", Roles.values());
    }

    protected void AddAttributesReservation(Model model) {
        AddAttributes(model);
    }

    protected void AddAttributesRoute(Model model, Long id) {
        AddAttributes(model);
        model.addAttribute("route", repoRouters.getById(id));
        model.addAttribute("dates", repoRouteDate.findByRouteId(id));
    }

    protected void AddAttributesRouteEdit(Model model, Long id) {
        AddAttributes(model);
        model.addAttribute("route", repoRouters.getById(id));
    }

}
