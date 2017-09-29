package com.example.madhusudhanbr.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by madhusudhanb.r on 9/27/17.
 */

public class MovieData {
    List<Map<String,?>> moviesList;
    public List <Map<String,?>> getMoviesList() {
        return moviesList ;
    }
    public int getSize() {
        return moviesList.size() ;
    }
    public HashMap getItem(int i){
        if (i >=0 && i<moviesList.size() ){
            return (HashMap)moviesList.get(i);
        }
        else
            return null ;
    }

    public MovieData() {
// Movie detail information is your choice .
        Integer vote_count ;
        Integer id ;
        Double vote_avg ;
        Double popularity ;
        String title ;
        String poster_path ;
        String backdrop_path ;
        String overview ;
        String release ;
        //List < Integer > genres ;
// need to add your 25 movies

        moviesList = new ArrayList<Map<String, ?>>();

        HashMap one = createMovie(211672,R.drawable.minions,4381,6.4,1169.4,"Minions","/q0R4crx2SehcEEQEkYObktdeFy.jpg", "/uX7LXnsC7bZJZjn048UCOwkPXWJ.jpg","Minions Stuart, Kevin and Bob are recruited by Scarlet Overkill, a super-villain who, alongside her inventor husband Herb, hatches a plot to take over the world.","2015-06-17");
        moviesList.add(one);

        HashMap two = createMovie(321612,R.drawable.it,416,6.5,312.466822,"It","/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg", "/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg",
                "In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.",
                "2017-08-17");
        moviesList.add(two);

        HashMap three = createMovie(396422,R.drawable.anna,767,7.4,282.445457,"Annabelle","/tb86j8jVCVsdZnzf8I6cIi65IeM.jpg", "/o8u0NyEigCEaZHBdCYTRfXR8U4i.jpg",
                "Several years after the tragic death of their little girl, a dollmaker and his wife welcome a nun and several girls from a shuttered orphanage into their home, soon becoming the target of the dollmaker's possessed creation, Annabelle.",
                "2017-08-03");
        moviesList.add(three);

        HashMap four = createMovie(324852,R.drawable.despicable,1704,6.2,280.445457,"Despicable Me 3","/5qcUGqWoWhEsoQwNUrtf3y3fcWn.jpg", "/ftRkFtAGuHngHnLiOxktq0aCVMF.jpg",
                "Gru and his wife Lucy must stop former '80s child star Balthazar Bratt from achieving world domination.",
                "2017-06-15");
        moviesList.add(four);

        HashMap five = createMovie(315635,R.drawable.spiderman,3014,7.3,230.445457,"Spider-Man: Homecoming","/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg",  "/vc8bCGjdVp0UbMNLzHnHSLRbBWQ.jpg",
                "Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges.",
                "2017-07-05");
        moviesList.add(five);

        HashMap six = createMovie(297762,R.drawable.wonderwomen,4266,7.3,230.445457,"Wonder women","/imekS7f1OuHyUP2LAiTEM0zBzUz.jpg",  "/6iUNJZymJBMXXriQyFZfLAKnjO6.jpg",
                "An Amazon princess comes to the world of Man to become the greatest of the female superheroes ",
                "2017-07-05");
        moviesList.add(six);

        HashMap sev = createMovie(118340,R.drawable.guardians,9398,7.9,197.033695,"Guardians of the Galaxy","/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg", "/bHarw8xrmQeqf3t8HpuMY7zoK4x.jpg",
                "An Amazon princess comes to the world of Man to become the greatest of the female superheroes ",
                "2017-07-05");
        moviesList.add(sev);

        HashMap eight = createMovie(339404,R.drawable.layover,44,7.9,197.033695,"The Layover","/kb9osnqanXRpkpm1bnSqAhKoq5T.jpg", "/ibianpvL865w7rBPAg3sPlEXUyh.jpg",
                "When their plane is rerouted due to a hurricane warning, two single female best friends find themselves competing for the same guy during an extended layover in St. Louis.",
                "2017-09-01");
        moviesList.add(eight);

        HashMap nine = createMovie(166426,R.drawable.pirates,2265,6.6,230.445457,"Pirates of the Caribbean: Dead Men Tell No Tales","/imekS7f1OuHyUP2LAiTEM0zBzUz.jpg",  "/6iUNJZymJBMXXriQyFZfLAKnjO6.jpg",
                "Thrust into an all-new adventure, a down-on-his-luck Capt. Jack Sparrow feels the winds of ill-fortune blowing even more strongly when deadly ghost sailors led by his old nemesis, the evil Capt. Salazar, escape from the Devil's Triangle. Jack's only hope of survival lies in seeking out the legendary Trident of Poseidon, but to find it, he must forge an uneasy alliance with a brilliant and beautiful astronomer and a headstrong young man in the British navy.",
                "2017-05-23");
        moviesList.add(nine);

        HashMap ten = createMovie(390043,R.drawable.hitman,508,7.3,230.445457,"The Hitman's Bodyguard","/5CGjlz2vyBhW5xHW4eNOZIdgzYq.jpg",  "/7KsqfXDECZMryX1Rv4RKsT7SIjQ.jpg",
                "The world's top bodyguard gets a new client, a hit man who must testify at the International Court of Justice. They must put their differences aside and work together to make it to the trial on time.",
                "2017-08-16");
        moviesList.add(ten);

        HashMap eleven = createMovie(157336,R.drawable.interstellar,10592,7.3,230.445457,"Interstellar","/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg",  "/xu9zaAevzQ5nnrsXN6JcahLnG4i.jpg",
                "Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage.",
                "2014-11-05");
        moviesList.add(eleven);

        HashMap twelve = createMovie(135397,R.drawable.jurassic,8443,7.3,230.445457,"Jurassic World","/jjBgi2r5cRt36xF6iNUEhzscEcb.jpg",  "/dkMD5qlogeRMiEixC4YNPUvax2T.jpg",
                "Twenty-two years after the events of Jurassic Park, Isla Nublar now features a fully functioning dinosaur theme park, Jurassic World, as originally envisioned by John Hammond.",
                "2015-06-09");
        moviesList.add(twelve);

        HashMap thirteen = createMovie(126889,R.drawable.alien,2400,7.3,230.445457,"Alien: Covenant","/zecMELPbU5YMQpC81Z8ImaaXuf9.jpg",  "/kMU8trT43p5LFoJ4plIySMOsZ1T.jpg",
                "Bound for a remote planet on the far side of the galaxy, the crew of the colony ship 'Covenant' discovers what is thought to be an uncharted paradise, but is actually a dark, dangerous world – which has its sole inhabitant the 'synthetic', David, survivor of the doomed Prometheus expedition.",
                "2017-07-05");
        moviesList.add(thirteen);

        HashMap fourteen = createMovie(353491,R.drawable.darktower,555,7.3,230.445457,"The Dark Tower","/i9GUSgddIqrroubiLsvvMRYyRy0.jpg",  "/2n7Zn6WxJ76ccOwnuQHuhSFMbqt.jpg",
                "The last Gunslinger, Roland Deschain, has been locked in an eternal battle with Walter O’Dim, also known as the Man in Black, determined to prevent him from toppling the Dark Tower, which holds the universe together. With the fate of the worlds at stake, good and evil will collide in the ultimate battle as only Roland can defend the Tower from the Man in Black.",
                "2017-08-03");
        moviesList.add(fourteen);

        HashMap fifteen = createMovie(374720,R.drawable.dunkirik,2214,7.9,197.033695,"Dunkirk","/bOXBV303Fgkzn2K4FeKDc0O31q4.jpg", "/fudEG1VUWuOqleXv6NwCExK0VLy.jpg",
                "The miraculous evacuation of Allied soldiers from Belgium, Britain, Canada and France, who were cut off and surrounded by the German army from the beaches and harbor of Dunkirk, France, between May 26th and June 4th 1940, during the Battle of France in World War II.",
                "2017-07-19");
        moviesList.add(fifteen);

        HashMap sixteen = createMovie(283995,R.drawable.guardians2,4290,7.9,197.033695,"Guardians of the Galaxy 2","/y4MBh0EjBlMuOzv9axM4qJlmhzz.jpg", "/aJn9XeesqsrSLKcHfHP4u5985hn.jpg",
                "The Guardians must fight to keep their newfound family together as they unravel the mysteries of Peter Quill's true parentage. ",
                "2017-04-19");
        moviesList.add(sixteen);

        HashMap seventeen = createMovie(76341,R.drawable.madmax,9289,7.9,197.033695,"Mad Max: Fury Road","/kqjL17yufvn9OVLyXYpvtyrFfak.jpg", "/phszHPFVhPHhMZgo0fWTKBDQsJA.jpg",
                "An apocalyptic story set in the furthest reaches of our planet, in a stark desert landscape where humanity is broken, and most everyone is crazed fighting for the necessities of life. Within this world exist two rebels on the run who just might be able to restore order. There's Max, a man of action and a man of few words, who seeks peace of mind following the loss of his wife and child in the aftermath of the chaos. And Furiosa, a woman of action and a woman who believes her path to survival may be achieved if she can make it across the desert back to her childhood homeland.",
                "2015-05-13");
        moviesList.add(seventeen);

        HashMap eighteen = createMovie(293660,R.drawable.deadpool,10716,7.9,197.033695,"Deadpool","/inVq3FRqcYIRl2la8iZikYYxFNR.jpg", "/n1y094tVDFATSzkTnFxoGZ1qNsG.jpg",
                "Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.",
                "2016-02-09");
        moviesList.add(eighteen);

        HashMap nineteen = createMovie(263115,R.drawable.logan,5856,7.9,197.033695,"Logan","/gGBu0hKw9BGddG8RkRAMX7B6NDB.jpg", "/5pAGnkFYSsFJ99ZxDIYnhQbQFXs.jpg",
                "In the near future, a weary Logan cares for an ailing Professor X in a hideout on the Mexican border. But Logan's attempts to hide from the world and his legacy are upended when a young mutant arrives, pursued by dark forces.",
                "2017-02-28");
        moviesList.add(nineteen);

        HashMap twenty = createMovie(293768,R.drawable.kidnap,202,7.9,197.033695,"Kidnap","/9CabD3j9PrjRY054fL0WJuEcXHZ.jpg", "/6fwuBSN56KtiHH19bLRIxGtfpC5.jpg",
                "Single mother Karla McCoy lives a perfect life with her young son Frankie. One day, upon entering a local park, Karla sees her son suddenly being abducted out of the blue by a kidnapper. To save Frankie from being taken, Karla goes out on a mission to demand people in the city to help rescue her son.",
                "2017-08-04");
        moviesList.add(twenty);

        HashMap twenty1 = createMovie(381283,R.drawable.mother,14,7.9,197.033695,"Mother!","/qmi2dsuoyzZdJ0WFZYQazbX8ILj.jpg", "/rTi26DGOfFRAp7NMwzlvhO9UMm1.jpg",
                "A couple's relationship is tested when uninvited guests arrive at their home, disrupting their tranquil existence.",
                "2017-09-13");
        moviesList.add(twenty1);

        HashMap twenty2 = createMovie(433637,R.drawable.remians,0,7.9,197.033695,"What Still Remains","/8FnKMD3zS5dZIufLKGaJApYuQSk.jpg", "null",
                "After the loss of her family, a young woman struggles to survive in a world long-since destroyed by disease; but when a lonely traveler offers her a place in his community, she must decide if the promise of a better life is worth the risk of trusting him.",
                "2017-09-13");
        moviesList.add(twenty2);

        HashMap twenty3 = createMovie(342473,R.drawable.ballerina,352,7.9,197.033695,"Ballerina!","/60ZhK1FstSkC9Ms8lRWaTPm55kD.jpg", "/yfRWtsCVDiYnfrZ8ndL3G2WMHid.jpg",
                "Set in 1879 Paris. An orphan girl dreams of becoming a ballerina and flees her rural Brittany for Paris, where she passes for someone else and accedes to the position of pupil at the Grand Opera house.",
                "2017-09-13");
        moviesList.add(twenty3);

        HashMap twenty4 = createMovie(415842,R.drawable.assasin,4,7.9,197.033695,"American Assassin","/o40BAqdTQHiN3cUfpgieDUYI71z.jpg", "/puKZWmBIpuEMwGCn2hZkublG1rO.jpg",
                "Mitch Rapp is a CIA black ops recruit under the instruction of Cold War veteran Stan Hurley. The pair then is enlisted by CIA Deputy Director Irene Kennedy to investigate a wave of apparently random attacks on military and civilian targets. Together they discover a pattern in the violence that leads them to a joint mission with a lethal Turkish agent to stop a mysterious operative intent on starting a world war in the Middle East.",
                "2017-09-13");
        moviesList.add(twenty4);

        HashMap twenty5 = createMovie(427900,R.drawable.homeagain,7,7.9,197.033695,"Home Again","/z5CtCxpblBke2G8c7CMkstedMgY.jpg", "/pxpEFY66yYr5bA1N4PCm5b4uz40.jpg",
                "Life for a single mom in Los Angeles takes an unexpected turn when she allows three young guys to move in with her.",
                "2017-09-07");
        moviesList.add(twenty5);

    }
    private HashMap createMovie ( Integer id , int image , Integer
            vCount , Double vAvg , Double pop , String title , String poster ,
                                  String backdrop , String overview , String release
    ) {
        HashMap movie = new HashMap() ;
        movie.put("image",image );
        movie.put("id",id );
        movie.put("voteCount" , vCount );
        movie.put("voteAverage" , vAvg );
        movie.put("popularity" , pop );
        movie.put("title" , title );
        movie.put("poster" , poster );
        movie.put("backdrop" , backdrop ) ;
        movie.put("overview" , overview ) ;
        movie.put("release" , release );
        //movie.put(" genres " , genres );
        return movie ;
    }
}