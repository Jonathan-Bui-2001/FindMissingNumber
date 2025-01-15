Quest: in from 1 to N+1 list, one number is missing, find it.

ENGLISH BELOW

/** lời giải
 *  theo cách tìm số bị mất thông thường của dãy từ 1 đến N, tính hiệu của dãy số đủ với dãy số thiếu là xong
 *  nhưng vì dãy số hiện tại là 1 đến N+1, dùng cách trên sẽ gây sai lệch
 *  do đó, biến dãy 1 đến N+1 thành dãy 1 đến N bằng cách trừ bớt đi số N=1 là xong
 *  BÙI TẤN MINH - Jonathan Bui
 *
 *  *Chương trình có đi kèm một bộ tạo số bị mất ngẫu nhiên*
 */


/** Solution
 * According to the usual method of finding the missing number in a sequence from 1 to N, 
 * calculate the difference between the complete sequence and the missing sequence, and you're done.
 * However, since the current sequence is from 1 to N+1, using the above method would result in errors.
 * Therefore, convert the sequence from 1 to N+1 to a sequence from 1 to N by subtracting the number N=1, 
 * and you're done.
 * BUI TAN MINH - Jonathan Bui
 *
 * *The program includes a random missing number generator*
 */
