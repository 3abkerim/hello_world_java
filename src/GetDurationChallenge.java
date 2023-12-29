public class GetDurationChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(1));
    }
    public static String getDurationString(int seconds){
        if (seconds >= 0){
                return getDurationString(seconds/60,seconds%60);
        }else{
            return "error";
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59) ){
            int minutesToSecond = minutes*60;
            int totalSeconds = seconds + minutesToSecond;
            int hours = totalSeconds/3600;
            int remSeconds = totalSeconds%3600;
            int remMinutes = remSeconds/60;
            remSeconds = remSeconds%60;
            String finalHours = String.format("%02d", hours);
            String finalMinutes = String.format("%02d", remMinutes);
            String finalSeconds = String.format("%02d", remSeconds);
            return finalHours+"h "+finalMinutes+"m "+finalSeconds+"s";
        }else{
            return "error";
        }
    }
}
//transform the seconds into hours
// display the time in hours with the remaining minutes and seconds in a string
// in two steps to use the overloaded methods
//both methods return string XXh YYm ZZs
//the first method should call the second method to return results
//for the first method, the seconds parameter should be >=0
// the second method the mins parameter should be >=0 and the seconds parameter should be >=0 and <=59
//if either is passed an invalid value print out some meaningful message to the user