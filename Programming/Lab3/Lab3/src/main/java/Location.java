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
    }
}
