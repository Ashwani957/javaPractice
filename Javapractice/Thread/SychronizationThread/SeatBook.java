package SychronizationThread;
//Without synchroized 

// class BookThreaterSeat {
//     int total_seat = 10;
//     void bookSeat(int seat) {
//         if (total_seat >= seat) {
//             System.out.println("Seat Booking successfully" + Thread.currentThread().getName());
//             total_seat = total_seat - seat;
//             System.out.println("Seat left " + total_seat);
//         } else {
//             System.out.println("Seat is not available ");
//         }
//     }
// }
// public class SeatBook extends Thread {
//     static BookThreaterSeat bs; // create the reference of the variable Here 
//     int seats;
//     public void run() {
//         bs.bookSeat(seats);
//     }
//     public static void main(String args[]) {
//         bs = new BookThreaterSeat(); // create the object Here 
//         SeatBook sb1 = new SeatBook();
//         sb1.seats = 5;
//         sb1.start();
//         SeatBook sb2 = new SeatBook();
//         sb2.seats = 8;
//         sb2.start();
//     }
// }

//2. with synchronized keyword 
// Synchornized keyword ensure that only one thread will take the resource at a time

// class BookThreaterSeat {

//     int total_seat = 10;

//     synchronized void bookSeat(int seat) {
//         System.out.println("Thread calling " + Thread.currentThread().getName());
//         if (total_seat >= seat) {
//             System.out.println("Seat Booking successfully" + Thread.currentThread().getName());
//             total_seat = total_seat - seat;
//             System.out.println("Seat left " + total_seat);
//         } else {
//             System.out.println("Seat is not available ");
//         }
//     }
// }

// public class SeatBook extends Thread {

//     static BookThreaterSeat bs;
//     int seats;

//     public void run() {
//         bs.bookSeat(seats);
//     }

//     public static void main(String args[]) {
//         bs = new BookThreaterSeat();
//         SeatBook sb1 = new SeatBook();
//         sb1.seats = 5;
//         sb1.start();
//         SeatBook sb2 = new SeatBook();
//         sb2.seats = 2;
//         sb2.start();
//     }
// }

// 33 with synchorinzed block 

class BookThreaterSeat {
    int total_seat = 10;
    void bookSeat(int seat) {
        System.out.println("Thread Calling" + Thread.currentThread().getName());
        synchronized (this) {
            if (total_seat >= seat) {
                System.out.println("Seat Booking successfully" + Thread.currentThread().getName());
                total_seat = total_seat - seat;
                System.out.println("Seat left " + total_seat);
            } else {
                System.out.println("Seat is not available ");
            }
        }
    }
}
public class SeatBook extends Thread {
    static BookThreaterSeat bs;
    int seats;
    public void run() {
        bs.bookSeat(seats);
    }
    public static void main(String args[]) {
        bs = new BookThreaterSeat();
        SeatBook sb1 = new SeatBook();
        sb1.seats = 5;
        sb1.start();
        SeatBook sb2 = new SeatBook();
        sb2.seats = 2;
        sb2.start();
    }
}
