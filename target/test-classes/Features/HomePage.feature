#Author: MEd
Feature: Consultation de menu de Home Page

  Scenario Outline: Acceder au chaque menu de la page
    Given Utilisateur est connecte avec le bon username "Admin" et le bon login "admin123"
    When Utilisateur clique sur le "<menu>"
    Then La page de menu est affiche qui contient le nom de "<menu>"

    Examples: 
      | menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
