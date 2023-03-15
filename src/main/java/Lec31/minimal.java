//package Lec31;
//
//import java.util.*;
//
//public class minimal {
//    public static void main(String[] args) {
//        void kyaHai(){
//            int bataBe;
//            cin>>bataBe;
//            vector<int> yahiHai(bataBe);
//            for(int uuv=0;uuv<bataBe;uuv++) {
//                cin >> yahiHai[uuv];
//            }
//
//            map<int,int> JHGAFA;
//            JHGAFA[yahiHai[0]]++;
//
//            vector<int> pahlaa(bataBe);
//            vector<int> dusraaa(bataBe);
//            pahlaa[0] = 0;
//
//
//
//
//            for(int uuv=1;uuv<bataBe;uuv++){
//                if(JHGAFA.find(yahiHai[uuv]+1) != JHGAFA.end()){
//                    pahlaa[uuv] = JHGAFA[yahiHai[uuv]+1];
//                }
//                else{
//                    pahlaa[uuv] = 0;
//                }
//                JHGAFA[yahiHai[uuv]]++;
//            }
//            long jodle = 0;
//            long yeChahiye = 0;
//            map<int,int> kyaHaal;
//            kyaHaal[yahiHai[bataBe-1]]++;
//            dusraaa[bataBe-1] = 0;
//
//
//
//            for(int uuv = bataBe-2;uuv>=0;uuv--){
//                if(kyaHaal.find(yahiHai[uuv]-1) != kyaHaal.end()){
//                    dusraaa[uuv] = kyaHaal[yahiHai[uuv]-1];
//                }
//                else{
//                    dusraaa[uuv] = 0;
//                }
//                kyaHaal[yahiHai[uuv]]++;
//            }
//
//            vector<int> jugaad(bataBe);
//            for(int uuv=0;uuv<bataBe;uuv++){
//                jugaad[uuv] = (pahlaa[uuv] - dusraaa[uuv]);
//            }
//
//
//
//
//            for(int uuv = bataBe-1;uuv>=0;uuv--) {
//                jodle += jugaad[uuv];
//                if (jodle < 0) jodle = 0;
//                yeChahiye = max(yeChahiye, jodle);
//            }
//            cout<<yeChahiye<<endl;
//        }
//    }
//}
