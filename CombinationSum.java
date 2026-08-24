import java.util.*;

public class CombinationSum {
    private static class State{
        int start;
        int remaining;
        List<Integer> path;

        State(int start, int remaining, List<Integer> path){
            this.start = start;
            this.remaining = remaining;
            this.path = path;
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();

        Deque<State> stack = new ArrayDeque<>();
        stack.push(new State(0, target, new ArrayList<>()));

        while(!stack.isEmpty()){
            State state = stack.pop();

            if(state.remaining == 0){
                result.add(state.path);
                continue;
            }

            for(int i = state.start; i<candidates.length; i++){
                int c = candidates[i];
                if(c> state.remaining){
                    break;
                }
                List<Integer> newPath = new ArrayList<>(state.path);
                newPath.add(c);
                stack.push(new State(i, state.remaining - c, newPath));
            }
        }
        return result;
    }
}
