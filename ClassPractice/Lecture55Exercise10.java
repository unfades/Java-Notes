import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class Account{
    private String name;
    private int number;
    private double balance;

    public Account(String name, int number, double balance){
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.number + ", " + this.balance;
    }

}

class Bank{
    HashMap<Integer, Account> map = new HashMap<>();
    
    public void addAccount(Account a){
        map.put(a.getNumber(),a);
    }

    public void getAccount(int k){
        if(map.containsKey(k))
            System.out.println(map.get(k));
        else
            System.out.println("the account number " + k + " doesn't exist, try another or create a new account");
    }

    public void removeAccount(int k){
        if(map.containsKey(k))
            map.remove(k);
        else
            System.out.println("Wrong credentials or doesn't exist");
    }

    public void getCount(){
        System.out.println("The amount of accounts in the bank is: " + map.size());
    }

    public void getAllAccounts(){
        System.out.println("all accounts in the bank are as follows: ");
        
        for(Map.Entry<Integer, Account> i : map.entrySet()){
            System.out.println(i.getValue());
        }
    }
}

public class Lecture55Exercise10 {
    public static void main(String[] args) {
        Account a1 = new Account("hav", 7777, 1000000.0);
        Account a2 = new Account("jay", 7801, 1000000.0);
        Account a3 = new Account("ayu", 8000, 1000000.0);
        Account a4 = new Account("kay", 6666, 1000000.0);
        Bank b = new Bank();
        b.addAccount(a1);
        b.addAccount(a2);
        b.addAccount(a3);
        b.addAccount(a4);
        b.getAllAccounts();
        System.out.println("getting account as asked by account number: ");
        b.getAccount(7777);
        System.out.println("removing account by account number: ");
        b.removeAccount(7777);
        System.out.println("now the total is calculated again: ");
        b.getCount();
        System.out.println("after removal of that account all accounts are: ");
        b.getAllAccounts();
    }
}
