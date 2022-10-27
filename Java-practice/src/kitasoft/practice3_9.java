package kitasoft;

import java.io.*;

public class practice3_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("予約したい曜日の数字を入力してください");
		System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜 => ");
		int day = Integer.parseInt(rb.readLine());
		System.out.println("予約したい時間帯を入力してください");
		System.out.print("0=午前、1=午後、2=夜間 => ");
		int time = Integer.parseInt(rb.readLine());
		
//		switch(day) {
//			case 0:
//				System.out.println("日曜は休診です");
//				break;
//			case 1:
//				System.out.println("開いています");
//				break;
//			case 2:
//				if(time == 0) {
//					System.out.println("午前は休診です");
//				} else if(time == 1) {
//					System.out.println("午後は開いています");
//				} else {
//					System.out.println("午後は開いています");
//				}
//				break;
//			case 3:
//				if (time == 0) {
//					System.out.println("午前は開いています");
//				} else if (time == 1) {
//					System.out.println("午後は開いています");
//				} else {
//					System.out.println("夜間は休診です");
//				}
//				break;
//			case 4:
//				System.out.println("開いています");
//				break;
//			case 5:
//				if(time == 0) {
//					System.out.println("午前は休診です");
//				} else if(time == 1) {
//					System.out.println("午後は開いています");
//				} else {
//					System.out.println("夜間は休診です");
//				}
//				break;
//			case 6:
//				if(time == 0) {
//					System.out.println("午前は開いています");
//				} else if(time == 1) {
//					System.out.println("午後は休診です");
//				} else {
//					System.out.println("夜間は休診です");
//				}
//				break;
//		}
		
		boolean bopen =true;
		
		if(day == 0) {
			bopen = false;
		} else if(time == 0 && (day == 2 || day == 5)) {
			bopen = false;
		} else if(time == 1 && day == 6) {
			bopen = false;
		} else if(time == 2 && (day == 3 || day == 6)) {
			bopen = false;
		}
		
		if(bopen) {
			System.out.println("診療しています");
		} else {
			System.out.println("休診です");
		}
	}
}
