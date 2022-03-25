public class User {
    public static void main(String[] args) {
        SavingAccount mil= new SavingAccount("Millenium",2137);
        SavingAccount pkobp= new SavingAccount("PkoBp",2115);
        SavingAccount ing= new SavingAccount("Ing",1939);

        BankAccount savingBankAccount= new BankAccount();
        savingBankAccount.addAccount(mil);
        savingBankAccount.addAccount(pkobp);
        savingBankAccount.addAccount(ing);

        CurrentAccount bnp = new CurrentAccount("Bnp",9000);
        CurrentAccount pkosa = new CurrentAccount("PkoSa",6000);

        BankAccount currentBankAccount= new BankAccount();
        currentBankAccount.addAccount(bnp);
        currentBankAccount.addAccount(pkosa);

        BankAccount allBankAccount= new BankAccount();
        allBankAccount.addAccount(savingBankAccount);
        allBankAccount.addAccount(currentBankAccount);
        allBankAccount.showAccountDetails();
        System.out.println("------------- Obecne konta");
        allBankAccount.removeAccount(savingBankAccount);
        allBankAccount.showAccountDetails();



    }
}
