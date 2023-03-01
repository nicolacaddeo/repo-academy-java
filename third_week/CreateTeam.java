package third_week;

import java.util.Scanner;
import java.util.ArrayList;

public class CreateTeam {
    // ArrayList per le info dei vari membri
    static ArrayList<String> managers = new ArrayList<String>();
    static ArrayList<String> bosses = new ArrayList<String>();
    static ArrayList<String> players = new ArrayList<String>();
    static ArrayList<String> reserves = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Benvenuto nel generatore squadre!");
        boolean createTeam = true;
        while (createTeam) { // loop per il menú principale
            System.out.println("Scegli un'opzione:\n[1] Crea un team\n[2] Esci");
            Scanner scannerForMenu = new Scanner(System.in);
            int userChoice = scannerForMenu.nextInt();
            switch (userChoice) {
                case 1:
                    // chiedo i dati dei dirigenti
                    while (managers.size() < 2) {
                        System.out.println("Inserisci i dati dei dirigenti");
                        Scanner managerScanner = new Scanner(System.in);
                        String inputManager = managerScanner.nextLine();
                        managers.add(inputManager);
                    }
                    while (bosses.size() < 2) {
                        System.out.println("Inserisci i nomi dei boss");
                        Scanner bossScanner = new Scanner(System.in);
                        String inputBoss = bossScanner.nextLine();
                        bosses.add(inputBoss);
                    }
                    // creo l'oggetto dirigenza assegnando il valore agli attributi
                    Dirigenza dirigenza1 = new Dirigenza(managers.get(0), managers.get(1), bosses.get(0),
                            bosses.get(1));
                    // chiedo i dati dei giocatori
                    while (players.size() < 2) {
                        System.out.println("Inserisci i dati dei titolari");
                        Scanner scannerStartingPlayer = new Scanner(System.in);
                        String inputStartingPlayer = scannerStartingPlayer.nextLine();
                        players.add(inputStartingPlayer);
                    }

                    while (reserves.size() < 2) {
                        System.out.println("Inserisci i dati delle riserve");
                        Scanner scannerReservePlayer = new Scanner(System.in);
                        String inputReservePlayer = scannerReservePlayer.nextLine();
                        reserves.add(inputReservePlayer);
                    }
                    // creo l'oggetto giocatori
                    Giocatori giocatori1 = new Giocatori(players.get(0), players.get(1), reserves.get(0),
                            reserves.get(1));
                    // chiedo il nome della squadra
                    System.out.println("Inserisci il nome del team");
                    Scanner scannerTeamName = new Scanner(System.in);
                    String teamName = scannerTeamName.nextLine();

                    // CREO L'OGGETTO SQUADRA
                    System.out.println("... Creazione squadra in corso, attendere....");
                    Team team1 = new Team(teamName, managers.get(0), managers.get(1), bosses.get(0), bosses.get(1),
                            players.get(0), players.get(1),
                            reserves.get(0), reserves.get(1));
                    System.out.println("Squara registrata con successo!");
                    // stampo le info del team
                    System.out.println("Nome del team: " + team1.name);
                    System.out.println("----------------------------------------------------");
                    System.out.println("DIRIGENZA--->\nManager: " + team1.manager1 + "e " + team1.manager2);
                    System.out.println("Boss: " + team1.boss1 + " e " + team1.boss2);
                    System.out.println("----------------------------------------------------");
                    System.out.println("GIOCATORI--->\nTitolari: " + team1.titolare1 + "e " + team1.titolare2);
                    System.out.println("Boss: " + team1.riserva1 + " e " + team1.riserva2);
                    break;
                case 2:
                    System.out.println("Alla prossima");
                    createTeam = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile, riprovare");
            }
        }

    }

}

class Dirigenza {
    String manager1;
    String manager2;
    String boss1;
    String boss2;

    Dirigenza(String manager1, String manager2, String boss1, String boss2) {
        this.manager1 = manager1;
        this.manager2 = manager2;
        this.boss1 = boss1;
        this.boss2 = boss2;
    }
}

class Giocatori {
    String titolare1;
    String titolare2;
    String riserva1;
    String riserva2;

    Giocatori(String titolare1, String titolare2, String riserva1, String riserva2) {
        this.titolare1 = titolare1;
        this.titolare2 = titolare2;
        this.riserva1 = riserva1;
        this.riserva2 = riserva2;
    }
}

class Team {
    String name;
    // dirigenza
    String manager1;
    String manager2;
    String boss1;
    String boss2;
    // ------------
    // giocatori
    String titolare1;
    String titolare2;
    String riserva1;
    String riserva2;

    // -------------
    Team(String name, String manager1, String manager2, String boss1, String boss2, String titolare1, String titolare2,
            String riserva1, String riserva2) {
        this.name = name;
        this.manager1 = manager1;
        this.manager2 = manager2;
        this.boss1 = boss1;
        this.boss2 = boss2;
        this.titolare1 = titolare1;
        this.titolare2 = titolare2;
        this.riserva1 = riserva1;
        this.riserva2 = riserva2;
    }

}