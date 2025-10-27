package SychronizationThread;

// without static keyword we face an error 
// class ThreaterSeatBooking {
//     int total_seat = 20;
//     synchronized void bookSeat(int seat) {
//         if (total_seat >= seat) {
//             System.out.println("ThreadName:" + Thread.currentThread().getName());
//             System.out.println("Seat Booking Succesfully" + seat);
//             total_seat = total_seat - seat;
//             System.out.println("Seat pending" + total_seat);
//         } else {
//             System.out.println("Seat is not available ");
//         }
//     }
// }
// class ThreadeOne extends Thread {
//     ThreaterSeatBooking th;
//     int seats;
//     ThreadeOne(ThreaterSeatBooking th, int seats) {
//         this.th = th;
//         this.seats = seats;
//     }
//     public void run() {
//         th.bookSeat(seats);
//     }
// }
// class ThreadeTwo extends Thread {
//     ThreaterSeatBooking th;
//     int seats;
//     ThreadeTwo(ThreaterSeatBooking th, int seats) {
//         this.th = th;
//         this.seats = seats;
//     }
//     public void run() {
//         th.bookSeat(seats);
//     }
// }
// public class StaticSynchronization {
//     public static void main(String args[]) {
//         ThreaterSeatBooking th = new ThreaterSeatBooking();
//         ThreadeOne t1 = new ThreadeOne(th, 5);
//         t1.start();
//         ThreadeTwo t2 = new ThreadeTwo(th, 3);
//         t2.start();
//         // another objec of the threate book class 
//         ThreaterSeatBooking th1 = new ThreaterSeatBooking();
//         ThreadeOne t3 = new ThreadeOne(th1, 15);
//         t3.start();
//         ThreadeTwo t4 = new ThreadeTwo(th1, 3);
//         t4.start();
//     }
// }
// with staic keyword 
// if we use the static keyword then it belong to the class not to the object then enter in the class every thread requreid the class lock to enter in the thread 
class ThreaterSeatBooking {

    static int total_seat = 20;

    static synchronized void bookSeat(int seat) {
        if (total_seat >= seat) {
            System.out.println("ThreadName:" + Thread.currentThread().getName());
            System.out.println("Seat Booking Succesfully" + seat);
            total_seat = total_seat - seat;
            System.out.println("Seat pending" + total_seat);

        } else {
            System.out.println("Seat is not available ");

        }
    }

}

class ThreadeOne extends Thread {

    ThreaterSeatBooking th;
    int seats;

    ThreadeOne(ThreaterSeatBooking th, int seats) {
        this.th = th;
        this.seats = seats;

    }

    public void run() {
        th.bookSeat(seats);

    }
}

class ThreadeTwo extends Thread {

    ThreaterSeatBooking th;
    int seats;

    ThreadeTwo(ThreaterSeatBooking th, int seats) {
        this.th = th;
        this.seats = seats;
    }

    public void run() {
        th.bookSeat(seats);
    }

}

public class StaticSynchronization {

    public static void main(String args[]) {

        ThreaterSeatBooking th = new ThreaterSeatBooking();
        ThreadeOne t1 = new ThreadeOne(th, 5);
        t1.start();
        ThreadeTwo t2 = new ThreadeTwo(th, 3);
        t2.start();

        // another objec of the threate book class 
        ThreaterSeatBooking th1 = new ThreaterSeatBooking();
        ThreadeOne t3 = new ThreadeOne(th1, 15);
        t3.start();
        ThreadeTwo t4 = new ThreadeTwo(th1, 3);
        t4.start();

    }
}
