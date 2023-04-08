package org.example.homework_4;

 class JavaClock {
    int clock;
    int minutes;
    int second;

    public JavaClock(int clock, int minutes, int second) {
        this.clock= clock;
        this.minutes = minutes;
        this.second = second;}

        public JavaClock() {
            this.clock = 12;
            this.minutes = 0;
            this.second = 0;
        }
        public JavaClock(int second){
        this.clock = second/3600;
        this.minutes = ((second-(this.clock *3600)) /60);
        this.second = second;
    }


        }

