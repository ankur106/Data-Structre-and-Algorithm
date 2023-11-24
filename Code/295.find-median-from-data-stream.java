/*
 * @lc app=leetcode id=295 lang=java
 *
 * [295] Find Median from Data Stream
 */

// @lc code=start

import java.util.*;

class MedianFinder {

     Queue<Integer> left;
    Queue<Integer> right;
    int size;
    public MedianFinder() {
        left = new PriorityQueue<>((a,b)->b-a);
        right = new PriorityQueue<>();
        size=0;
    }
    
    public void addNum(int num) {

        left.offer(num);
        right.offer(left.poll());

        if(left.size() < right.size()){
            left.offer(right.poll());
        }
        size++;
        
    }
    
    public double findMedian() {
        System.out.println(left.size() + " "+ right.size());

        if(size%2 == 0){
            
            // System.out.println(left.peek() + " "+ right.peek());
            return (double)(left.peek()+ right.peek())/2;
        }else{
            
            // System.out.println(left.peek());
            return (double) left.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
// @lc code=end

