import java.util.Scanner;
//Inisialisasi variabel global
class Inisialisasi {
	public int [] data;
	public int panjang;
	public int i;

	//Inisialisasi
	public Inisialisasi(int panjang){
		this.panjang = panjang;
		this.data = new int[panjang];
		i=0;	
	}
	//Input Antrian
	public void inputAntrian(int nilai){
		data[i] = nilai;
		i++;
	}
	//Keluar Antrian
	public void keluarAntrian() {
		int temp, kosong=0;
		for (int j=0; j<panjang-1; j++){
			temp = data[j+1];
			data[j] = temp;
			data[j+1] = kosong;
		}
	}
	//Menampilkan Hasil
	public void tampilHasil(){
		System.out.println("Urutan data :"); //Urutan data
		for (int n=0; n<panjang; n++){
			System.out.println("Data ke-"+(n+1)+" ;"+data[n]);
		}
		System.out.println();
	}
}
	//Inisialisasi Class
	class Antrian{
		public static void main(String[] args){ //inisialisasi variabel
			Scanner sc = new Scanner(System.in);
			Inisialisasi in;
			int p,angka,k,pilihan =1,n;
			System.out.print("Masukan Panjang Antrian : "); //Input panjang antrian
			p = sc.nextInt();
			in = new Inisialisasi(p);
			
			//Pilhan Menu
			while(pilihan==1 || pilihan==2)
			{
           		System.out.print("\nPilih \n");
           		System.out.print("1 Input Data\n");
           		System.out.print("2 Keluarkan Data \n");
           		System.out.print("3 Exit \n");
           		System.out.print("masukan pilihan anda : ");
           		pilihan=sc.nextInt();
            		if (pilihan==1)//Menu pilihan 1
            		{
            			//Inputan Data Yang Akan di Input
            			System.out.print("Berapa data yang akan di input : ");
            			n=sc.nextInt();
            			for(k=0; k<n; k++) 
            			{
							System.out.print("Angka ke"+(k+1)+" :");
							angka = sc.nextInt();
							in.inputAntrian(angka);
           				}
           				in.tampilHasil(); //Menampilkan Data Yang telah diinput
           			}
           else if(pilihan==2) //Menu pilihan 2
           {
            	System.out.print("Berapa data yang akan dikeluarkan : "); //Masukan jumlah data yang akan dikeluarkan
            	p=sc.nextInt();
            	for(k=0; k<p; k++)
            	{
            		in.keluarAntrian();
            	}
           
            		in.tampilHasil(); //Menampilkan data yang telah dikeluarkan
           }
           else if(pilihan==3) //Menu pilihan 3
            System.exit(0);
           }
           else
            {
            	System.out.print("PILIHAN SALAH \n");
             	pilihan = 1;
             }
           
       
			}
		}
	}
