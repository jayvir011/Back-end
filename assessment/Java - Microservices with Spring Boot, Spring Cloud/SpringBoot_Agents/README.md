# Campus Bot - Spring Boot AI Agent System

A Spring Boot application implementing an **Agent-Based Architecture** using **Google Gemini AI**. This project demonstrates how to build a flexible, intelligent chatbot where specialized agents handle different components of a user query.

## 🚀 Project Overview

The system processes student queries related to:
- **Admissions**
- **Academics** (Courses, Syllabus)
- **Exams**
- **Fees & Scholarships**
- **Placements**

## 🧠 Agent-Based Architecture

The core of this system is the **Orchestrator Agent**, which delegates tasks to specialized sub-agents.

### Agent Workflow
1. **User Interaction Agent (ChatController)**: Receives the POST request.
2. **Orchestrator Agent**: The central brain. It first calls the **Intent Agent**.
3. **Intent Detection Agent**: Uses Gemini AI to classify the user's intent (e.g., "What are the fees?" -> `FEES`).
4. **Domain Agents** (Admission, Fees, Exam, etc.): Based on intent, the Orchestrator calls the relevant agent to fetch data (Mock Data for this demo).
5. **Response Generation Agent**: Takes the raw data and the original question, then asks Gemini AI to generate a polite, human-like answer.

## 🛠 Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Google Gemini API** (Generative AI)
- **Maven**
- **Lombok**

## ⚙️ Configuration

1. Open `src/main/resources/application.properties`.
2. Replace `YOUR_GEMINI_API_KEY` with your actual Google Cloud Vertex AI or Gemini API key.

```properties
gemini.api.key=YOUR_ACTUAL_KEY_HERE
```

## 🏃‍♂️ How to Run

1. Build the project:
   ```bash
   mvn clean install
   ```
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```
3. The server starts at `http://localhost:8080`.

## 🧪 API Usage

**Endpoint**: `POST /api/chat`

**Request Body**:
```json
{
  "message": "What is the fee for B.Tech?"
}
```

**Response**:
```json
{
  "reply": "The annual tuition fee for the B.Tech program is $2,000. Additionally, please note that the deadline for payment without penalty is August 15th."
}
```

## 📚 Learning Focus

- **Loose Coupling**: Agents are independent. You can add a `HostelAgent` without touching `ExamAgent`.
- **Orchestration**: Separation of control logic (Orchestrator) from business logic (Domain Agents).
- **AI Integration**: Using LLMs for specific cognitive tasks (Intent Classification, Natural Language Generation) rather than one giant prompt.
