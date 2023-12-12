package nextstep.ladder.controller;

import java.util.List;

import nextstep.ladder.domain.Height;
import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Participants;
import nextstep.ladder.domain.User;
import nextstep.ladder.domain.util.StringSplitter;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.ResultView;

public class LadderController {
	public static void main(String[] args) {
		List<User> users = StringSplitter.splitByComma(ResultView.showParticipants(InputView.inputUsers()));
		Height height = new Height(ResultView.showHeight(InputView.inputHeight()));
		Ladder ladder = new Ladder(new Participants(users), height);
		ResultView.showLadder(height.height(), ladder);
	}
}