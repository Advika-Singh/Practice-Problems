public class P3_TheNicknameTag {

    static final class NameTag {
        private final String firstName;
        private final String lastName;
        private final String nickname;

        public NameTag(String fullName) {
            String[] parts = fullName.split(" ");
            this.firstName = parts[0];
            this.lastName = parts[1];
            this.nickname = firstName + " " + lastName.charAt(0) + ".";
        }

        public String getNickname() {
            return nickname;
        }
    }

    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println("getNickname() -> \"" + tag.getNickname() + "\"");

        NameTag sameName = new NameTag("Maria Gomez");
        System.out.println("Same nickname: " + tag.getNickname().equals(sameName.getNickname()));
        System.out.println("Same object: " + (tag == sameName));
    }
}
