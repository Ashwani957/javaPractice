// class BankAccount {
//   constructor(owner, balance) {
//     this.owner = owner;
//     this._balance = balance; // _balance = "private-like" property (hidden)
//   }

//   // Method to deposit money
//   deposit(amount) {
//     if (amount > 0) {
//       this._balance += amount;
//       console.log(`Deposited ₹${amount}. New balance: ₹${this._balance}`);
//     } else {
//       console.log("Deposit amount must be positive!");
//     }
//   }

//   // Method to withdraw money (abstract-like behavior)
//   withdraw(amount) {
//     if (amount > 0 && amount <= this._balance) {
//       this._balance -= amount;
//       console.log(`Withdrew ₹${amount}. Remaining balance: ₹${this._balance}`);
//     } else {
//       console.log("Invalid withdrawal amount!");
//     }
//   }

//   // Method to check balance
//   getBalance() {
//     console.log(`Account balance: ₹${this._balance}`);
//   }
// }


// const bankdetails =new BankAccount("Ashwani",10000)
// bankdetails.deposit(100)
// bankdetails.getBalance()
// bankdetails.withdraw(50)
// bankdetails.getBalance()




class BankAccount{

    constructor(owner,balance){

        this.owner=owner
        this._balance=balance
    

    }

    deposit(amount){

        if(amount>0){
            this._balance+=amount; 
            console.log(`Deposited ₹${amount}. New balance: ₹${this._balance}`)

        }
        else {
            console.log(" deposit Amount always be positive ")
        }


    }

    withdraw(amount){
        if(amount>0 && amount<=this._balance){
            this._balance-=amount
            console.log(`Withdrew ₹${amount}. Remaining balance: ₹${this._balance}`)
    }
    else{
        console.log("Insufficient balance")
        
    }
}

    getBalance(){
        console.log(`Account balance: ₹${this._balance}`)
    }
    }


const bankdetails=new BankAccount("Ashwani",12000);
bankdetails.deposit(100)
bankdetails.getBalance()
bankdetails.withdraw(50)