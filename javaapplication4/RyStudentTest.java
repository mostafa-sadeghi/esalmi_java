/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
public class RyStudentTest {
    public static void main(String[] args) {
        RyStudent rys1 = new RyStudent("ali","rezaei","1");
        RyStudent rys2 = new RyStudent("alit","rezaei","1");
        boolean res = rys1.equals(rys2);
        System.out.println(res);

    }
}
