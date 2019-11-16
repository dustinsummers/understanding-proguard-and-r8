-injars      TestFile3Classes
-outjars     TestFile3_Out_1
-libraryjars /Applications/Android Studio.app/Contents/jre/jdk/Contents/Home/jre/lib
-printseeds seeds-2.txt
-printusage usage-2.txt

-dontobfuscate
-dontoptimize

-keep class TestFile3 {
    public static void main(java.lang.String[]);
}