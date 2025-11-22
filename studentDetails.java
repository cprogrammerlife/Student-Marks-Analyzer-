package student;
import java.util.Scanner;

public class studentdetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] stud = studentdetails.readstud(sc);
		disStudmark(stud);
		rtotal(stud);
		findoveralltopper(stud);
		dstudavg(stud,0);
		colavg(stud);
		highestpertest(stud);
		sc.close();
	}
	public static int[][] readstud(Scanner sc) {
		System.out.println("Enter the no of students : ");
		int nstud = sc.nextInt();
		int nsub =  4;
		int[][] stud = new int[nstud][nsub];
		for(int i =0;i<stud.length;i++) {
			for(int j =0;j<stud[i].length;j++) {
				System.out.println("Enter the marks of student "+(i+1)+" in subject "+(j+1));
				stud[i][j] = sc.nextInt();
			}
		}
		return stud;
	}
	public static void disStudmark(int[][] a) {
		int s = a.length;
		System.out.println("********************");
		System.out.println("STUDENT MARKS LIST :");
		System.out.println("********************");
		  for (int i = 0; i < a.length; i++) {
	            System.out.print("Student " + (i + 1) + " : ");
	            for (int mark : a[i]) {
	                System.out.print(mark + " ");
	            }
	            System.out.println();
	            System.out.println();
	        }
		
	}
	public static void rtotal(int[][] a) {
		int rtotal = 0;
		
		System.out.println("TOTAL MARKS OF THE STUDENTS : ");
		for(int i =0;i<a.length;i++) {
			rtotal = 0;	
			for(int j =0;j<a[i].length;j++) {
				rtotal += a[i][j];
			}
			System.out.print("The total marks of Student "+(i+1)+" is "+rtotal);
			System.out.println();
			System.out.println();
		}
	}
	public static void findoveralltopper(int[][] a ) {
		int topper = a[0][0];
		int index = 0;
		
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				if(a[i][j] > topper) {
					topper = a[i][j];
					index = i;
				}
			}
		}System.out.println("HIGHEST MARKS : ");
		System.out.println("The overall topper is with marks : "+topper);
		System.out.println();
	}
	public static void dstudavg(int[][] a , int rtotal) {
		int avg =0;
		System.out.println("AVERAGE MARKS OF THE STUDENTS : ");
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				rtotal += a[i][j];
				avg = rtotal / a.length;
				
			}
			System.out.println("The avg marks of the student "+(i+1)+" is "+avg);
			System.out.println();
		}
		System.out.println();
		}
	public static void colavg(int[][] a) {
		System.out.println("SUBJECT WISE AVG : ");
		int coltotal =0;
		int colavg = 0;
		for(int j =0;j<a[0].length;j++) {
			coltotal =0;
			for(int i =0;i<a.length;i++) {
				coltotal += a[i][j];
				colavg = coltotal / a.length;
			}
			System.out.println("The avg of students in subject "+(j+1)+" is "+colavg);
			System.out.println();
			
		}
	}
	public static void highestpertest(int[][] a) {
		System.out.println("HIGHEST MARKS IN EACH SUBJECT : ");
		for(int j =0;j<a[0].length;j++) {
			int hightest = a[0][0];
			for(int i =0;i<a.length;i++) {
				if(a[i][j] > hightest) {
					hightest = a[i][j];
				}

			}
			System.out.println("The highest marks in subject "+(j+1)+" is "+hightest);
			System.out.println();
		}
	}
}
