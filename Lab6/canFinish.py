from collections import defaultdict

class Courses:
    def canFinish(self, numCourses, prerequisites):
        graph = defaultdict(list)
        for pair in prerequisites:
            graph[pair[1]].append(pair[0])

        visited = [False] * numCourses
        current = [False] * numCourses

        for i in range(numCourses):
            if self.isCycle(graph, visited, current, i):
                return False

        return True

    def isCycle(self, graph, visited, current, start):
        visited[start] = True
        current[start] = True

        for neighbor in graph[start]:
            if not visited[neighbor] and self.isCycle(graph, visited, current, neighbor):
                return True
            elif current[neighbor]:
                return True

        current[start] = False
        return False

if __name__ == "__main__":
    course = Courses()
    numCourses = 2
    prerequisites = [[1,0], [0,1]]
    print(course.canFinish(numCourses, prerequisites))