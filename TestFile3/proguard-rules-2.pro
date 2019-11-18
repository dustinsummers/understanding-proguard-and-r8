-injars      TestFile3Classes
-outjars     TestFile3_Out_2
-libraryjars /Applications/Android Studio.app/Contents/jre/jdk/Contents/Home/jre/lib/rt.jar
-printseeds TestFile3_Out_2/seeds.txt
-printusage TestFile3_Out_2/usage.txt

-dontobfuscate
-dontoptimize

-keep class TestFile3 {
    public static void main(java.lang.String[]);
}
