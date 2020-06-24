package com.kaen.filmhub_j.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.models.Movie;
import com.kaen.filmhub_j.models.Series;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    //adding movies data
    public static List<Movie> getBestMovies(){
        //creating a list of movies and add an arrayList of names and covers to it.
        List<Movie> lstMovies=new ArrayList<>();

        //adding data
        lstMovies.add
                (
                        new Movie(
                                "Sierra Burgess Is a Loser",
                                "A wrong-number text sparks a virtual romance between a smart but unpopular teen and a sweet jock who thinks he's talking to a gorgeous cheerleader.",
                                "2018",
                                "71%",
                                "Shannon Purser, Kristine Froseth, RJ Cyler, Noah Centineo, Loretta Devine, Giorgia Whigham, Alice Lee, Lea Thompson, Alan Ruck, Mary Pat Gleason, Chrissy Metz",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/2bc9c1297888548cf914a1ee11b534f83.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "When We First Met",
                                "Using a magical photo booth that sends him back in time, Noah relives the night he met Avery over and over, trying to persuade her to fall for him.",
                                "2018",
                                "52.25%",
                                "Alexandra Daddario, Ari Sandel, Robbie Amell, Adam DeVine, Shelley Hennig, Andrew Bachelor",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/428def3336dbb9a4ab3a31da495dd7d70f1.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/428.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "John Mulaney: Kid Gorgeous at Radio City",
                                "John Mulaney relays stories from his childhood and \"SNL,\" eviscerates the value of college and laments getting older in this electric comedy special.",
                                "2018",
                                "87.33%",
                                "John Mulaney",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/46979b2164d9d7846839be9eda19ee5e168.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/469.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "22 July",
                                "After devastating terror attacks in Norway, a young survivor, grieving families and the country rally for justice and healing. Based on a true story.",
                                "2018",
                                "72%",
                                "Anders Danielsen Lie, Jon &#x0d8igarden;, Jonas Strand Gravli, Ola G. Furuseth, Maria Bock, Thorbjørn Harr, Jaden Smith",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/4768ab9fc8065cd4ea79772933bac6d1b9a.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/476.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "Ali Wong: Hard Knock Wife",
                                "Two years after the hit \"Baby Cobra,\" Ali Wong is back with another baby bump -- and a torrent of hilarious truths about marriage and motherhood.",
                                "2018",
                                "80.33%",
                                "Ali Wong",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/9275bff6090e64c42c0a03400bcedb8fa6f.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/927.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "Black Water",
                                "A faithful CIA operative is drugged and brought aboard the Blackwater, a high-security submarine. His jailors plan to torture the truth out of him.",
                                "2018",
                                "36.67%",
                                "Jean-Claude Van Damme, Dolph Lundgren, Al Sapienza, Jasmine Waltz, Patrick Kilpatrick, Kristopher Van Varenberg, Courtney B Turk, Aleksander Vayshelboym, Lance E. Nichols",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/13127238b23442984402821a87344f228af6.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1312.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "Papa: Hemingway in Cuba",
                                "During the Cuban Revolution, a young journalist travels to Havana to meet Ernest Hemingway, the larger-than-life author who deeply inspired him.",
                                "2015",
                                "54.25%",
                                "Joely Richardson, Giovanni Ribisi, Shaun Toub, Adrian Sparks, Minka Kelly, Bob Yari, James Remar, Jeff Jonas, Anthony Molinari, Ryan Buckley, Katie Venosh, Parker Venosh, Todd Venosh",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/235953a314572a8a41b4b23cf90708b22d42.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2359.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "Okja",
                                "A gentle giant and the girl who raised her are caught in the crossfire between animal activism, corporate greed and scientific ethics.",
                                "2017",
                                "77.25%",
                                "Tilda Swinton, Jake Gyllenhaal, Paul Dano, Bong Joon Ho, Steven Yeun, An Seo Hyun, Giancarlo Esposito, Shirley Henderson, Devon Bostick, Lily Collins, Yoon Je Moon, Daniel Henshall, Byun Heebong, Woo Shik Choi",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/186632d8fe0e3984326a570e605cec93ecb.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/186.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "Under an Arctic Sky",
                                "Six fearless surfers travel to the north coast of Iceland to ride waves unlike anything they've ever experienced, captured with high-tech cameras.",
                                "2017",
                                "74.5%",
                                "Sam Hammer, Chris Burkard, Ingo Olsen, Elli Thor Magnusson, Heidar Logi, Timmy Reyes, Steve Hawk, Justin Quintal, Sigurdur Jonsson, Mark Renneker",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/2454c26280bf3084d96a0a7febed68b80a5.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/245.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "Win It All",
                                "After losing 50,000 that wasn't his, gambling addict Eddie starts to rebuild his life. But an unwelcome surprise pushes him toward his old ways.",
                                "2017",
                                "70%",
                                "Aislinn Derbez, Joe Swanberg, Joe Lo Truglio, Jake Johnson, Keegan-Michael Key, Nicky Excitement",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/751ccfdbcfa59d040f59abb574513cb2628.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/751.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "Coin Heist",
                                "When a crisis threatens to destroy their high school, four teens hatch a daring plan to raise $10 million. Step one? Breaking into the U.S. Mint.",
                                "2017",
                                "56.67%",
                                "Mark Blum, Sasha Pieterse, Neal Huff, Alex Saxon, Alexis G. Zall, Jay Walker, Blanche Baker, Will Denton, Connor Ratliff, Michael Cyril Creighton",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/817368e92726280428c9f2cc185e5431c5b.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/817.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "A Monster Calls",
                                "Overwhelmed by his mother's illness, a young boy begins to understand human complexity through the fantastic tales of a consoling tree monster.",
                                "2016",
                                "77%",
                                "Lewis MacDougall, Sigourney Weaver, Felicity Jones, Toby Kebbell, Geraldine Chaplin, Liam Neeson",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/10895418617914a543e1bccd6e10bdde87f6.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1089.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "A Stand Up Guy",
                                "When his outrageous open-mic standup comedy routine goes viral, low-rent mobster-in-hiding Sammy gets a lot of attention he seriously doesn't want.",
                                "2016",
                                "51%",
                                "Ethan Suplee, Luke Robertson, Jay R. Ferguson, Danny A. Abeckaser, Nick Cordero, Annie Heise, Michael Rapaport, Bob Saget, Ray Iannicelli, Moran Attias",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/109765d2508c022249c5b8fcdc673e43f9e8.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1097.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "The Autopsy of Jane Doe",
                                "A father-son team of small-town coroners performs an autopsy on an unidentified woman with mysterious injuries and a terrifying secret.",
                                "2016",
                                "71.25%",
                                "Brian Cox, Emile Hirsch, Michael McElhatton, Ophelia Lovibond, André vredal;, Parker Sawyers, Jane Perry",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/1206079c80adb152446585234dc2fba3cc5a.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1206.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "Be Somebody",
                                "To escape the stress of fame, teen pop star Jordan goes incognito in a small town, where he forms a special bond with high school art student Emily.",
                                "2016",
                                "67.33%",
                                "Caitlin Keats, LaMonica Garrett, Sarah Jeffery, Mason McCulley, Allison Paige, Matthew Espinosa, Tava Smiley, Mahaley Patel",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/125542049a4a25454a05a93c16dcca25640f.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1255.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "The Bleeder",
                                "Husband. Father. Fighter. Meet Chuck Wepner, the liquor salesman and self-proclaimed real-life inspiration behind Rocky Balboa.",
                                "2016",
                                "69%",
                                "Ron Perlman, Liev Schreiber, Naomi Watts, Jim Gaffigan, Elisabeth Moss, Philippe Falardeau, Michael Rapaport, Jason Jones, Pooch Hall, Morgan Spector",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/1317fac1c2289dd94cb69e149c3df0bf7a96.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1317.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "Cabin Fever",
                                "As a flesh-eating virus rips its way through a remote woodland cabin, the terrified teens vacationing inside wonder who'll fall victim next.",
                                "2016",
                                "37.25%",
                                "Gage Golightly, Matthew Daddario, Samuel Davis, Nadine Crocker, Dustin Ingram, Randy Schulman",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/13793cfa2f9626a84006a0ce981b5bf5d8b1.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1379.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "Ghostheads",
                                "With help from his best friend and a public-access psychic, a nerdy young man assembles his dream team of like-minded ghost hunters.",
                                "2016",
                                "37%",
                                "David Krumholtz, Justin Long, Melonie Diaz, Amy Sedaris, Jon Heder, Paul W. Downs, Jason Hawes, Steve Gonsalves",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/1716d2cd7d8b6b8a4d149e31626135853ee6.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1716.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "Ouija: Origin of Evil",
                                "In 1960s California, a fake medium's daughter tries to communicate with her late father through a Ouija board, but unleashes a demon instead.",
                                "2016",
                                "66.75%",
                                "Elizabeth Reaser, Annalise Basso, Lulu Wilson, Henry Thomas, Parker Mack, Kate Siegel, Eve Gordon, Doug Jones, Sam Anderson",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/23435dc6138a40aa4b7e9768d0783063e678.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2343.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "Pup Star",
                                "After a singing pup with big dreams of stardom gets dognapped and escapes with a friend's help, her journey home is a fun, music-filled adventure.",
                                "2016",
                                "65%",
                                "Tom Everett Scott, Jed Rees, Diedrich Bader, David DeLuise, Carla Jimenez, Makenzie Moss, George Newbern, John Ratzenberger, Bonnie Somerville",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/24420f007cb768ae45b6abc0a21a9bd86ac7.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2442.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "Silicon Cowboys",
                                "This documentary tells the story of Compaq Computer and its three founders, who in 1982, took on Goliath IBM at the height of its PC dominance.",
                                "2016",
                                "73.6%",
                                "Jason Cohen",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/26119e53ee2699364d769aaebfa1d5df328c.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2611.jpg"
                        )
                );
        lstMovies.add
                (
                        new Movie(
                                "The Sweet Life",
                                "Two strangers with suicidal tendencies embark on a cross-country trek to San Francisco, where they plan to jump from the Golden Gate Bridge.",
                                "2016",
                                "67%",
                                "Rob Spera, J.D. Evermore, Abigail Spencer, Chris Messina, Tyson Ritter, Maggie Siff, Scott Michael Campbell, Jayne Brook, Wilson Cruz, Cheryl Francis Harrington",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/2711744ecfe528dd48e7a35ff2628a9b4486.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2711.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "Results",
                                "After an ugly divorce, a wealthy but unhappy man trains at a local gym and develops a strange relationship with the owner and a captivating trainer.",
                                "2015",
                                "62.8%",
                                "Anthony Michael Hall, Guy Pearce, Giovanni Ribisi, Kevin Corrigan, Cobie Smulders, Brooklyn Decker, Constance Zimmer, Tishuan Scott",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/790fcbc125f02ad435ab2b05288e47e716f.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/790.jpg"
                        )
                );

        lstMovies.add
                (
                        new Movie(
                                "Love",
                                "A man in an unsatisfying marriage recalls the details of an intense past relationship with an ex-girlfriend when he gets word that she may be missing.",
                                "2015",
                                "52.4%",
                                "Gaspar Noé, Karl Glusman, Aomi Muyock, Klara Kristin, Ugo Fox, Juan Saavedra, Déborah Révy, Isabelle Nicou, Benoît Debie, Vincent Maraval",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/20904d7df3863de14a72bef76d6707e9b2e7.mp4",
                                "https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2090.jpg"
                        )
                );





        return lstMovies;
    }
    //adding series data
    public static List<Series> getBestSeries(){
        //creating a list of movies and add an arrayList of names and covers to it.
        List<Series> lstSeries=new ArrayList<>();
        //adding title, movies image
        lstSeries.add(new Series("bad boys", R.drawable.slide1,R.drawable.johnwichcover));
        lstSeries.add(new Series("john wick", R.drawable.slide2));
        lstSeries.add(new Series("bad boys", R.drawable.slide1,R.drawable.johnwichcover));
        lstSeries.add(new Series("john wick", R.drawable.slide2));
        lstSeries.add(new Series("bad boys", R.drawable.slide1,R.drawable.johnwichcover));
        lstSeries.add(new Series("john wick", R.drawable.slide2));
        return lstSeries;
    }

}
