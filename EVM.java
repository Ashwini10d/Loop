import java.util.Scanner;
class EVM{
	//why global bec it assign with the default value.
	static int bjp,cong,ss,mns,aap,nota;
	public static void main(String []args)
	{


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The population:");
		int pop=sc.nextInt();
		//loop will iterate population times.

		for(int i=1;i<=pop;i++){
			System.out.println();
			System.out.println(" 	WELCOME		");
			System.out.println();
			System.out.println("1.BJP");
			System.out.println("2.CONGRESS");
			System.out.println("3.SHIV SENA");
			System.out.println("4.AAP");
			System.out.println("5.NOTA");
			System.out.println();
			System.out.println("Enter Your vote");
			int vote =sc.nextInt();

			switch(vote){
				case 1:{
					System.out.println("ACCHE DIN AYENGE");
					bjp++;
					break;
				}
				case 2:{
					System.out.println("BHARAT JODO");
					cong++;
					break;
				}
				case 3:{
					System.out.println("HUM HAI ASLI SENA");
					ss++;
					break;
				}
				case 4:{
					System.out.println("JAI MAHARASHTRA");
					mns++;
					break;
				}
				case 5:{
					System.out.println("APKA EK VOTE MUZE AZAD KAREGA");
					aap++;
					break;
				}
				default:{
					System.out.println("INVALID INPUT");
					i--;
					break;
				}
			}
		}
		if(bjp>=cong && bjp>=mns && bjp>=ss && bjp>=aap && bjp>=nota)
			System.out.println("BJP WON THE ELECTION"+bjp+"votes");

		else if(cong>=bjp && cong>=mns && cong>=ss && cong>=aap && cong>=nota)
			System.out.println("CONGRESS WON THE ELECTION"+cong+"votes");

		else if(mns>=bjp && mns>=cong && mns>=ss && mns>=aap && mns>=nota)
			System.out.println("MNS WON THE ELECTION"+mns+"votes");

		else if(ss>=bjp && ss>=mns && ss>=cong && ss>=aap && ss>=nota)
			System.out.println("SS WON THE ELECTION"+ss+"votes");

		else if(aap>=bjp && aap>=cong && aap>=ss && aap>=mns && aap>=nota)
			System.out.println("AAP WON THE ELECTION"+aap+"votes");
		else
			System.out.println("NOTA has"+nota+"votes and no one won the election");

	}
}