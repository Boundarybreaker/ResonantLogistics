package space.bbkr.resonantlogistics.api;

public class Query<T> {
	private final QueryType type;
	private final T contents;

	public Query(QueryType type, T contents) {
		this.type = type;
		this.contents = contents;
	}

	public QueryType getType() {
		return type;
	}

	public T getContents() {
		return contents;
	}

	public enum QueryType {
		PUT,
		GET,
		FIND
	}

}
