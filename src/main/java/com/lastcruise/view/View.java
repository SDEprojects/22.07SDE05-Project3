package com.lastcruise.view;

import com.lastcruise.model.GameText;
import java.util.Map;

public class View {

  private final Map<String, String> GAME_TEXT;

  public View() {
    GameText gameText = new GameText();
    GAME_TEXT = gameText.getGameText();
  }

  public void printGameBanner() {
    System.out.println(Colors.GREEN+ GAME_TEXT.get("Banner") +Colors.RESET);
  }

  public void printStory() {
    System.out.println(GAME_TEXT.get("Intro"));

  }


  public void printHelpCommands() {
    System.out.println(GAME_TEXT.get("Help"));
  }


  public void printInstructions() {
    System.out.println(GAME_TEXT.get("Instructions"));
  }


  public void printStoryIntro(String name) {
    System.out.printf(GAME_TEXT.get("StoryIntro"), name);
  }

  public void printNamePrompt() {
    System.out.print(GAME_TEXT.get("NamePrompt"));
  }

  public void printStartGamePrompt() {
    System.out.print(GAME_TEXT.get("StartGamePrompt"));
  }

  public void printStatusBanner(String location, String inventory, String locationDesc,
      String locationItems, String message) {
    System.out.printf(GAME_TEXT.get("Status"), location, inventory, locationDesc, locationItems,
        message);
//    System.out.printf(
//              "______________________________________________________________________________________________________%n"
//            + "Location: %s                                 Inventory: %s%n"
//            + "______________________________________________________________________________________________________%n%n"
//            + "Description: %s %n"
//            + "Location Items: %s %n%n"
//            + "%s%n"
//            + "%n> ", location, inventory, locationDesc, locationItems, message);
  }

  //------------VIEW MESSAGES------------------------------------------
  public String getItemDescription(String description) {
    return String.format(Colors.BLUE + GAME_TEXT.get("ItemDescription")+ Colors.RESET, description);
  }

  public String getInvalidItemMessage() {
    return Colors.RED + GAME_TEXT.get("ItemNotFound")+  Colors.RESET;
  }

  public String getInvalidCommandMessage() {
    return Colors.RED + GAME_TEXT.get("InvalidCommand")+Colors.RESET;
  }

  public String getInvalidLocationMessage() {
      return Colors.RED + GAME_TEXT.get("InvalidLocation") +Colors.RESET;
  }

  public String getSuccessfulRaftBuildMessage() {
    return Colors.GREEN + GAME_TEXT.get("BuildSuccessful") + Colors.RESET;
  }

  public String getNotSuccessfulRaftBuildMessage() {
    return Colors.RED + GAME_TEXT.get("BuildNotSuccessful") + Colors.RESET;
  }

  public String getNotInRaftLocationBuildMessage() {
    return Colors.RED + GAME_TEXT.get("InvalidCraftingLocation") + Colors.RESET;
  }

  public String getHelpCommands() {
    return Colors.BLUE + GAME_TEXT.get("Help")+ Colors.RESET;
  }

  public String cantGrabItem() {
    return Colors.RED+ GAME_TEXT.get("CantGrabItem")+ Colors.RESET;
  }

  public String getItemNotCraftable(){
    return Colors.RED + GAME_TEXT.get("ItemNotCraftable")+ Colors.RESET;

  }

  public String getCantEscape(){
    return Colors.RED+ GAME_TEXT.get("CantEscape") + Colors.RESET;
  }

  public String getYouWonMessage(){
    return Colors.GREEN + GAME_TEXT.get("Win")+ Colors.RESET;
  }

  public void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}