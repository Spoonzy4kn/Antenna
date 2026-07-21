# Implementation Backlog

**Project:** Antenna  
**Status:** In progress
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This backlog converts the documentation into implementation-ready epics and tasks.

It is not a sprint plan. It is a structured starting point for GitHub issues.

---

## 2. Epic 1: Repository foundation

Tasks:

- Add professional documentation set.
- Select licence.
- Add `.gitignore`.
- Add contribution guidelines.
- Add security policy.
- Add issue and pull request templates.
- Decide branch strategy.

Definition of done:

- Repository has clear public entry point and contribution basics.

---

## 3. Epic 2: Android skeleton

Status: started.

Tasks:

- Create Android project. Started.
- Configure Kotlin. Started.
- Configure Jetpack Compose. Started.
- Configure Gradle. Started.
- Select application ID. Started.
- Add basic theme. Started.
- Add primary navigation shell. Started.
- Add placeholder screens. Started.
- Generate and commit Gradle wrapper. Started.
- Confirm build and launch on emulator/device.

Definition of done:

- App builds and launches.
- Home, Search, Explore, My Subs, and Settings are reachable.

---

## 4. Epic 3: Local settings

Tasks:

- Implement theme setting.
- Implement NSFW visibility setting.
- Implement over-18 confirmation.
- Implement Settings sections.
- Add privacy text.

Definition of done:

- Settings persist locally.
- NSFW content visibility is disabled by default.

---

## 5. Epic 4: Local favourites / My Subs

Tasks:

- Define local favourite model.
- Select local storage mechanism.
- Add favourite repository.
- Add My Subs screen.
- Add add/remove actions.
- Prevent duplicates.
- Sort alphabetically.
- Add empty state.

Definition of done:

- User can manage local favourites without signing in.

---

## 6. Epic 5: Platform access

Tasks:

- Select Reddit-compatible access method.
- Implement network client.
- Define network models.
- Map network models to domain models.
- Implement error mapping.
- Implement community feed loading.

Definition of done:

- Supported public community feed can load or fail clearly.

---

## 7. Epic 6: Post and comment viewing

Tasks:

- Implement post preview UI.
- Implement post detail UI.
- Implement text/link/image support where available.
- Implement comments.
- Implement nested rendering.
- Implement collapse/expand.
- Handle deleted/removed comments.

Definition of done:

- User can read supported posts and comments.

---

## 8. Epic 7: Search and Explore

Tasks:

- Implement Search screen.
- Implement community search where supported.
- Implement post search where supported.
- Implement Explore screen where supported.
- Add sorting/filter controls.
- Add empty and error states.

Definition of done:

- Search and Explore support useful discovery without misrepresenting unsupported features.

---

## 9. Epic 8: Quality, privacy, and release

Tasks:

- Add unit tests for local favourites.
- Add tests for settings.
- Add tests for error mapping.
- Add manual QA checklist.
- Run accessibility checks.
- Run privacy review.
- Update changelog.
- Prepare release notes.

Definition of done:

- Release checklist passes.

---

## 10. Summary

The backlog should begin with repository and Android foundations, then local data, platform browsing, post/comment viewing, search/explore, and quality hardening.
