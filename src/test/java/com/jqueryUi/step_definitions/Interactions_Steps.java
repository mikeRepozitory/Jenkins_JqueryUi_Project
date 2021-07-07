package com.jqueryUi.step_definitions;

import static com.jqueryUi.base.Hook.*;
import com.jqueryUi.pages.Interactions_MainPage_JqueryUi;
import io.cucumber.java.en.*;

public class Interactions_Steps {
    Interactions_MainPage_JqueryUi mainPage = new Interactions_MainPage_JqueryUi(driver);

    @Then("user selects Draggable button")
    public void user_selects_draggable_button() {
        mainPage.setDraggable_link();
    }

    @Then("user click on Drag me around box and drag it around")
    public void user_click_on_drag_me_around_box_and_drag_it_around() throws InterruptedException {
        mainPage.draggable_box_move(100, 100);
    }

    @Then("user selects Droppable button")
    public void user_selects_droppable_button() {
        mainPage.setDroppable_link();
    }

    @Then("user click on Drag box and drags it to target")
    public void user_click_on_drag_box_and_drags_it_to_target() throws InterruptedException {
        mainPage.droppable_box_move();

    }

    @Then("user selects Resizable button")
    public void user_selects_resizable_button() {
        mainPage.setResizable_link();
    }

    @Then("user clicks on Resizable icon and try to adjust i by making it smaller or bigger")
    public void user_clicks_on_resizable_icon_and_try_to_adjust_i_by_making_it_smaller_or_bigger() throws InterruptedException {
        mainPage.resizable_box_move(100, 100);
    }

    @Then("user selects Selectable button")
    public void user_selects_selectable_button() {
        mainPage.setSelectable_link();
    }

    @Then("user clicks on Selectable button")
    public void user_clicks_on_selectable_button() {
        mainPage.selectOneSelectable_Item();

    }

    @Then("user tries to click multiple  Selectable buttons by holding {string} keyboard")
    public void user_tries_to_click_multiple_selectable_buttons_by_holding_keyboard(String string) {
        mainPage.selectAllSelectable_Items();

    }

    @Then("user selects Sortable button")
    public void user_selects_sortable_button() {
        mainPage.setSortable_link();
    }

    @Then("user clicks on Sortable element and moves it down")
    public void user_clicks_on_sortable_element_and_moves_it_down() {
        mainPage.selectOneSortable_Item(3, 100);
    }




}
