package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nextstep.ladder.engine.Row;

public class Rows {
	private final List<Row> rows;

	public Rows(List<Row> rows) {
		this.rows = rows;
	}

	public Rows(Width width, Height height) {
		rows = new ArrayList<>();
		int heightValue = height.value();
		for (int idx = 0; idx < heightValue; idx++) {
			rows.add(new CustomRow(width));
		}
	}

	public List<Row> values() {
		return Collections.unmodifiableList(rows);
	}

	public int calcResultIndex(int currentIndex) {
		int resultIndex = currentIndex;
		for (Row row : rows) {
			resultIndex = row.move(resultIndex);
		}
		return resultIndex;
	}
}