/*
 * @lc app=leetcode id=1845 lang=java
 *
 * [1845] Seat Reservation Manager
 */

// @lc code=start

import java.util.*;

class SeatManager {
    // boolean[] li;
    // int count;
    // int n;
    Queue<Integer> que;

    public SeatManager(int n) {
        this.que =  new PriorityQueue<>();
        
        for(int i=1; i<= n;++i){
            que.offer(i);
        }

        // Arrays.fill(li, false);
        // this.count = 0;
        // this.n = n;
    }
    
    public int reserve() {
        // int temp=0;

        // for(int i=0; i < this.n; ++i){
        //     if(this.li[i]==false){
        //         temp = i+1;
        //         this.li[i] = true;
        //         this.count++;
        //     }
        // }

        // return temp;

        return this.que.poll();
        
    }
    
    public void unreserve(int seatNumber) {
        // this.li[seatNumber-1] = false;
        // this.count--;

        this.que.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
// @lc code=end

