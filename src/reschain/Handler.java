package reschain;

/**
 * @author lwyan on 2018-12-03 9:33
 */
public abstract class Handler {
	private Handler nextHandler;
	public final Response handleMessage(Request request){
		Response response = null;
		if(this.getHandlerLevel().equals(request.getRequestLevel())){
			response = this.echo(request);
		}else{
			if(this.nextHandler != null){
				response = this.nextHandler.handleMessage(request);
			}else{
				System.out.println("no");
			}
		}
		return response;
	}
	public void setNextHandler(Handler nextHandler){
		this.nextHandler = nextHandler;
	}
	protected abstract Level getHandlerLevel();
	protected abstract Response echo(Request request);
}