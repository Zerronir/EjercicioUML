public class Main {
    public static void main(String[] args) {

    }
}

interface Probe {
    int getLoad();
}

class Response {
    public String url;
    public int status;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

class Reply {

}

class Group {

}

class Client {

}

class Request {

}

class LoadBalancer {
    public Member member = new Member();


}

class Member extends LoadBalancer implements Probe{
    private String ip;
    private Response response;

    // Creamos lo métodos de la clase Member
    public int getProbeLoad(String s){
        return 0;
    }

    boolean isEnabled(){
        return false;
    }

    Response execute(Request req){
        return new Response();
    }

    // Implementamos los métodos de la interfaz Probe
    @Override
    public int getLoad() {
        return 0;
    }
}