package com.nullnumber1.lab4;

public enum Location {
    SILKHEAP {
        @Override
        public String toString() {
            return "silk heap";
        }
    },
    FOOLISLAND {
        @Override
        public String toString() {
            return "fool island";
        }
    },

    BACK {
        @Override
        public String toString() {
            return "the previous location";
        }
    },
    CAROUSEL {
        @Override
        public String toString() {
            return "shorties spinning on carousel";
        }
    },
    SOMEWHERE{
        @Override
        public String toString() {
            return "somewhere";
        }
    }
}
